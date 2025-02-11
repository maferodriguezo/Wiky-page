FROM openjdk:17-jdk-slim

COPY . /app

WORKDIR /app

RUN ./mvnw clean install -DskipTests


CMD [ "java", "-jar", "target/wiki-page-0.0.1-SNAPSHOT.JAR"]



EXPOSE 8081