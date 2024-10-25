plugins {
    kotlin("jvm") //version libs.versions.kotlin
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jsoup)
    implementation(libs.google.guava)
    implementation(libs.google.apis.sheets)
    implementation(libs.google.apis.drive)
    implementation(libs.google.apis.docs)
    implementation(libs.google.apis.gmail)
    implementation(libs.kotlin.reflect)
    implementation(libs.paranamer)
}