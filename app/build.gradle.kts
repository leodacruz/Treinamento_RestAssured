/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    implementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)

    // https://mvnrepository.com/artifact/org.freemarker/freemarker
    implementation("org.freemarker:freemarker:2.3.33")

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
    implementation("org.junit.jupiter:junit-jupiter-engine:5.10.3")

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    implementation("org.junit.jupiter:junit-jupiter-api:5.10.3")

    // https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all
    implementation("org.hamcrest:hamcrest-all:1.3")

    // https://mvnrepository.com/artifact/io.rest-assured/rest-assured
    implementation("io.rest-assured:rest-assured:5.5.0")

    // https://mvnrepository.com/artifact/io.rest-assured/json-schema-validator
    implementation("io.rest-assured:json-schema-validator:5.5.0")

    // https://mvnrepository.com/artifact/io.qameta.allure/allure-junit5
    implementation("io.qameta.allure:allure-junit5:2.29.0")
    
    // https://mvnrepository.com/artifact/io.qameta.allure/allure-attachments
    implementation("io.qameta.allure:allure-attachments:2.29.0")

    // https://mvnrepository.com/artifact/io.qameta.allure/allure-rest-assured
    implementation("io.qameta.allure:allure-rest-assured:2.29.0")

    // https://mvnrepository.com/artifact/io.qameta.allure/allure-attachments
    implementation("io.qameta.allure:allure-attachments:2.28.1")

    // https://mvnrepository.com/artifact/io.qameta.allure/allure-java-commons
    implementation("io.qameta.allure:allure-java-commons:2.29.0")

   // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite-engine
    implementation("org.junit.platform:junit-platform-suite-engine:1.10.3")

    // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite
    implementation("org.junit.platform:junit-platform-suite:1.10.3")

    // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite-api
    implementation("org.junit.platform:junit-platform-suite-api:1.10.3")

    // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-runner
    implementation("org.junit.platform:junit-platform-runner:1.10.0")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
 //   mainClass = "treinamento_restassured.App"
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
