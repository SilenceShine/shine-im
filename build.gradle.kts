plugins {
    id("java")
    kotlin("jvm") version "1.8.10"
    kotlin("plugin.spring") version "1.8.10"
}

group = "io.github.SilenceShine"
version = "0.0.1-SNAPSHOT"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        maven { url = uri("file:///E:\\environment\\maven\\maven-repository") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://repo.maven.apache.org/maven2") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://maven.pkg.github.com/SilenceShine/shine-framework") }
    }
}

subprojects {

    apply(plugin = "java")
    apply(plugin = "kotlin")

    dependencies {
        implementation(platform("io.github.SilenceShine:shine-framework-spring:${property("shineFrameworkVersion")}"))
        implementation(platform("com.alibaba.rsocket:alibaba-rsocket-broker-parent:${property("alibabaRsocketBrokerParent")}"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${property("kotlinx")}")
        implementation("org.jetbrains.kotlin:kotlin-reflect:${property("kotlin")}")
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
