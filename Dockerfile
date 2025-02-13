FROM openjdk:17-jdk-slim

COPY . /app

WORKDIR /app

RUN ./mvnw clean install -DskipTests


CMD [ "java", "-jar", "target/thymeleaf-wiky-0.0.1-SNAPSHOT.jar"]



EXPOSE 8081