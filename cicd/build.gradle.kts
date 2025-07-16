plugins {
	java
	id("org.springframework.boot") version "3.5.3"
	id("io.spring.dependency-management") version "1.1.7"

	// war 적용
	id("war")
}

group = "app.backend"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	implementation("org.apache.tomcat.embed:tomcat-embed-jasper")
	implementation("jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:2.0.0")

	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	runtimeOnly("com.h2database:h2")
	runtimeOnly("com.mysql:mysql-connector-j")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.named<War> ("war"){
	from("src/main/webapp") {
		into("WEB-INF")
	}
}