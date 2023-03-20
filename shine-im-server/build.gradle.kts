plugins {
    kotlin("plugin.spring") version "1.8.10"
}

group = "io.github.SilenceShine"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-rsocket")
    implementation("io.github.SilenceShine:shine-framework-spring-starter")
}


