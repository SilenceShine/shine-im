plugins {
    id("java")
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.spring") version "1.8.10"
}

group = "io.github.SilenceShine"
version = "0.0.1-SNAPSHOT"

val shineFrameworkVersion = "0.3.2-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/SilenceShine/shine-framework")
        }
    }
}

dependencies {
    implementation(platform("io.github.SilenceShine:shine-framework-spring:${shineFrameworkVersion}"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
