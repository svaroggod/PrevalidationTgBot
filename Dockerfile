FROM maven:3.8.1 AS builder
WORKDIR /PrevalidationTG/
COPY . .
RUN mvn clean package


FROM openjdk:17.0.1-jdk-buster
COPY --from=builder /PrevalidationTGBot/target/PrevalidationTGBot-1.0-SNAPSHOT-jar-with-dependencies.jar /PrevalidationTG/PrevalidationTG-1.0.jar
WORKDIR /PrevalidationTG/
ENTRYPOINT ["java",  "-jar","PrevalidationTG-1.0.jar"]



