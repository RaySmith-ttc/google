@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("jvm") version "1.9.10"
    `maven-publish`
    signing
    alias(libs.plugins.nmcp)
    alias(libs.plugins.nexus.staging)
}

group = "ru.raysmith"
version = "1.2.1"

repositories {
    mavenCentral()
}

java {
    withSourcesJar()
    withJavadocJar()
}

dependencies {
    implementation(libs.google.authClient)
    implementation(libs.google.apis.sheets)
    implementation(libs.google.apis.drive)
    implementation(libs.google.auth.oauth2)

    testImplementation(kotlin("test"))
    testImplementation(libs.jsoup)
}

tasks {
    test {
        useJUnitPlatform()
    }
}

kotlin {
    jvmToolchain(11)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            artifactId = project.name
            groupId = project.group.toString()
            version = project.version.toString()
            from(components["java"])
            pom {
                packaging = "jar"
                name.set("Google")
                url.set("https://github.com/RaySmith-ttc/google")
                description.set("DSL wrappers for java google libs")



                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                scm {
                    connection.set("scm:https://github.com/RaySmith-ttc/google.git")
                    developerConnection.set("scm:git@github.com:RaySmith-ttc/google.git")
                    url.set("https://github.com/RaySmith-ttc/google")
                }

                developers {
                    developer {
                        id.set("RaySmith-ttc")
                        name.set("Ray Smith")
                        email.set("raysmith.ttcreate@gmail.com")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            name = "OSSRH"
            val releasesUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().matches(".*(SNAPSHOT|rc.\\d+)".toRegex())) snapshotsUrl else releasesUrl
            credentials {
                username = System.getenv("SONATYPE_USER")
                password = System.getenv("SONATYPE_PASS")
            }
        }
    }
}

nmcp {
    publish("release") {
        username.set(System.getenv("CENTRAL_SONATYPE_USER"))
        password.set(System.getenv("CENTRAL_SONATYPE_PASS"))
        publicationType.set("USER_MANAGED")
        publicationType.set("AUTOMATIC")
    }
}


signing {
    sign(configurations.archives.get())
    sign(publishing.publications["release"])
}