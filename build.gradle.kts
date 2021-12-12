plugins {
  kotlin("jvm") version "1.6.0"
}

group = "io.plagov"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("io.kotest:kotest-runner-junit5:5.0.1")
}

tasks.test {
  useJUnitPlatform()
}
