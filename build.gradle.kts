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
        maven { url = uri("file:///E:\\environment\\maven\\maven-repository") }
        mavenLocal()
        mavenCentral()
        maven { url = uri("https://maven.pkg.github.com/SilenceShine/shine-framework") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
}

subprojects {

    apply(plugin = "java")
    apply(plugin = "kotlin")

    dependencies {
        implementation(platform("io.github.SilenceShine:shine-framework-spring:${shineFrameworkVersion}"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.10")
    }

    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

}
