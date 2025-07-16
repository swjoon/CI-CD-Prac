# .jar
#FROM eclipse-temurin:21-jre as builder
#WORKDIR extracted
#COPY ./build/libs/*.jar app.jar
#RUN java -Djarmode=layertools -jar app.jar extract
#
#FROM eclipse-temurin:21-jre
#WORKDIR /app
#
#COPY --from=builder extracted/dependencies/ ./
#COPY --from=builder extracted/spring-boot-loader/ ./
#COPY --from=builder extracted/snapshot-dependencies/ ./
#COPY --from=builder extracted/application/ ./
#
#ENV TZ=Asia/Seoul
#
#EXPOSE 8080
#ENTRYPOINT ["java", "-Duser.timezone=Asia/Seoul", "-Dspring.profiles.active=prod", "org.springframework.boot.loader.launch.JarLauncher"]

# .war + tomcat
FROM tomcat:10.1.20-jdk21-temurin

ENV TZ=Asia/Seoul
ENV JAVA_OPTS="-Duser.timezone=Asia/Seoul -Dspring.profiles.active=prod"

COPY ./build/libs/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080