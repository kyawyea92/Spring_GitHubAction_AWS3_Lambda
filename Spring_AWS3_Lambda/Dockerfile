FROM openjdk:21-jdk-slim
LABEL authors="kyawyelwin"
WORKDIR /app
COPY target/Spring_AWS3_Lambda-1.0.0-lambda-package.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]