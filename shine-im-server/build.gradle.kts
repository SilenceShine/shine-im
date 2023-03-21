plugins {
    kotlin("plugin.spring") version "1.8.10"
}

group = "io.github.SilenceShine"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("io.github.SilenceShine:shine-framework-spring-starter")
    implementation("com.alibaba.rsocket:alibaba-broker-registry-client-spring-boot-starter:${property("alibabaRsocketBrokerParent")}")
    implementation("org.springframework.boot:spring-boot-starter-rsocket")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
}
