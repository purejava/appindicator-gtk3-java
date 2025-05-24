plugins {
    id("java-library")
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    is("maven-publish")
    id("signing")
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.org.slf4j.slf4j.api)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.api)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.engine)
    testImplementation(libs.org.junit.jupiter.junit.jupiter)
    testRuntimeOnly(libs.org.junit.platform.junit.platform.launcher)
    testImplementation(libs.org.slf4j.slf4j.simple)
}

group = "org.purejava"
version = "1.4.3-SNAPSHOT"
description = "Java bindings for libayatana-appindicator and libappindicator-gtk3 in 100% pure Java"

java {
    sourceCompatibility = JavaVersion.VERSION_22
    withSourcesJar()
    withJavadocJar()
}

val sonatypeUsername: String = System.getenv("SONATYPE_USERNAME") ?: ""
val sonatypePassword: String = System.getenv("SONATYPE_PASSWORD") ?: ""

tasks.test {
    useJUnitPlatform()
    filter {
        includeTestsMatching("AppIndicatorTest")
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            pom {
                name.set("libappindicator-gtk3-java-minimal")
                description.set("Java bindings for libayatana-appindicator and libappindicator-gtk3 in 100% pure Java")
                url.set("https://github.com/purejava/appindicator-gtk3-java")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("purejava")
                        name.set("Ralph Plawetzki")
                        email.set("ralph@purejava.org")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/purejava/appindicator-gtk3-java.git")
                    developerConnection.set("scm:git:ssh://github.com/purejava/appindicator-gtk3-java.git")
                    url.set("https://github.com/purejava/appindicator-gtk3-java/tree/minimal")
                }
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/purejava/appindicator-gtk3-java/issues")
                }
            }
        }
    }
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username.set(sonatypeUsername)
            password.set(sonatypePassword)
        }
    }
}

if (!version.toString().endsWith("-SNAPSHOT")) {
    signing {
        useGpgCmd()
        sign(configurations.runtimeElements.get())
        sign(publishing.publications["mavenJava"])
    }
}

tasks.withType<Javadoc> {
    failOnError = false
    (options as StandardJavadocDocletOptions).encoding = "UTF-8"
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
