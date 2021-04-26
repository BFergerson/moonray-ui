plugins {
    id("java")
    id("com.avast.gradle.docker-compose") version "0.14.3"
}

repositories {
    mavenCentral()
}

dockerCompose {
    dockerComposeWorkingDirectory = "./docker"
    useComposeFiles = listOf("./docker-compose.yml")
    //captureContainersOutput = true
}
