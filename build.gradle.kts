@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("jvm") version libs.versions.kotlin
    `maven-publish`
    signing
    alias(libs.plugins.nmcp)
    alias(libs.plugins.nexus.staging)
    alias(libs.plugins.benManes.versions)
}

group = "ru.raysmith"
version = "2.0.0"

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
    implementation(libs.google.apis.gmail)
    implementation(libs.google.apis.docs)
    implementation(libs.google.auth.oauth2)

    testImplementation(kotlin("test"))
    testImplementation(libs.jsoup)
    testImplementation(libs.kotest.assertions)
    testImplementation(libs.javax.mail)
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
        publicationType.set("AUTOMATIC")
    }
}


signing {
    sign(configurations.archives.get())
    sign(publishing.publications["release"])
}