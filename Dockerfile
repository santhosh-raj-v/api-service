#FROM openjdk:11-jdk-slim

#COPY target/my-spring-boot-app.jar app.jar
#
#ENV PORT=8080
#
#EXPOSE $PORT
#
#CMD ["java", "-jar", "app.jar"]


FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENV PORT=8080
EXPOSE $PORT

ENTRYPOINT ["java","-jar","/app.jar"]
