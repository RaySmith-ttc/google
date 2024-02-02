plugins {
    kotlin("jvm") version "1.9.10"
    id("maven-publish")
}

publishing {
    repositories {
        maven {
            name = "OSSRH"
            url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")

            credentials {
                username = System.getenv("SONATYPE_USER")
                password = System.getenv("SONATYPE_PASS")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}


group = "ru.raysmith"
version = "1.0.0"

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
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}