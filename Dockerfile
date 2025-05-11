# Stage 1: Build the app
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app
COPY ./portfolio_api_spring_boot /app
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
