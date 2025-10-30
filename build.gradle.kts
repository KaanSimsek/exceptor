plugins {
	id("java-library")
	id("org.springframework.boot") version "3.4.1"
	id("io.spring.dependency-management") version "1.1.7"
	id("maven-publish")
	id("com.github.ben-manes.versions") version "0.51.0"
	id("net.thebugmc.gradle.sonatype-central-portal-publisher") version "1.2.3"
}

group = "io.github.kaansimsek"
version = "0.0.6.1"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
	withJavadocJar()
	withSourcesJar()
}

repositories {
	mavenCentral()
	mavenLocal()
}

publishing {
	publications {
		create<MavenPublication>("mavenJava") {
			from(components["java"])
			versionMapping {
				usage("java-api") {
					fromResolutionOf("runtimeClasspath")
				}
				usage("java-runtime") {
					fromResolutionResult()
				}
			}
		}
	}
}

signing {
	val secretKey = System.getenv("SIGNING_SECRETKEY")
	val passphrase = System.getenv("SIGNING_PASSPHRASE")

	useInMemoryPgpKeys(secretKey, passphrase)
	sign(publishing.publications["mavenJava"])
}


centralPortal {
	username = System.getenv("SONATYPE_USERNAME")
	password = System.getenv("SONATYPE_PASSWORD")

	pom {
		name = "Exceptor"
		description = "A api exception library for SpringBoot"
		url = "https://github.com/KaanSimsek/exceptor"
		licenses {
			license {
				name = "The Apache License, Version 2.0"
				url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
			}
		}
		developers {
			developer {
				id = "1"
				name = "Kaan Simsek"
				email = "ksimsek19@edu.tr"
			}
		}
		scm {
			url.set("https://github.com/kaansimsek/exceptor")
		}

	}
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	compileOnly("org.springframework.boot:spring-boot-starter-web")
	annotationProcessor("org.springframework.boot:spring-boot-autoconfigure-processor")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<Javadoc>().configureEach {
	// Suppress doclint warnings and errors
	(options as StandardJavadocDocletOptions).addStringOption("Xdoclint:none", "-quiet")
}

tasks.jar {
	archiveClassifier.set("")
}
