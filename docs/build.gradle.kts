import org.asciidoctor.gradle.model5.jvm.extensions.AsciidoctorjDiagram
import org.asciidoctor.gradle.model5.jvm.toolchains.AsciidoctorjToolchain
import java.awt.Desktop

plugins {
    alias(libs.plugins.asciidoctor)
    alias(libs.plugins.asciidoctorDiagram)
}

repositories {
    mavenCentral()
}

private val asciidoctorjToolchain = "asciidoctorj"
asciidoc {
    toolchains {
        named<AsciidoctorjToolchain>(asciidoctorjToolchain) {
            asciidocExtensions {
                named<AsciidoctorjDiagram>("diagram") {
                    usePlantUml()
                }
            }
        }
    }
    publications {
        named("main") {
            sourceSet {
                setSourceDir(file("."))
                sources { include("index.adoc") }
                baseDir.baseDirFollowsSourceDir()

                // attribute ref: https://docs.asciidoctor.org/asciidoc/latest/attributes/document-attributes-ref/
                // embed images, the diagrams in the html
                attributes { add("data-uri", "") }
            }
            output(asciidoctorjToolchain, "html")
        }
    }
}

tasks.register("openDocs") {
    description = "Opens the generated html documentation in the browser"
    group = "documentation"
    dependsOn("asciidoctorHtml")
    doLast {
        check(Desktop.isDesktopSupported()) { "Task can only be run on a desktop pc with a browser" }
        val html = layout.buildDirectory.file("docs/asciidoc/html/index.html").get().asFile.toURI()
        Desktop.getDesktop().browse(html)
    }
}