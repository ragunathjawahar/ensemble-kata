plugins {
  kotlin("jvm") version "1.9.0"
  application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.approvaltests:approvaltests:19.0.0")
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(8)
}

application {
  mainClass.set("MainKt")
}
