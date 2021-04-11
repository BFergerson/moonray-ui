import java.io.FileOutputStream
import java.net.URL

plugins {
    id("java")
}

repositories {
    mavenCentral()
}

tasks {
    register("downloadSkywalking") {
        doLast {
            println("Downloading Apache SkyWalking")
            val f = File(projectDir, "docker/apache-skywalking-apm-es7-8.4.0.tar.gz")
            if (!f.exists()) {
                URL("https://downloads.apache.org/skywalking/8.4.0/apache-skywalking-apm-es7-8.4.0.tar.gz")
                    .openStream().use { input ->
                        FileOutputStream(f).use { output ->
                            input.copyTo(output)
                        }
                    }
            }
            println("Downloaded Apache SkyWalking")
        }
    }
}