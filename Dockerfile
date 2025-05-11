# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/myapp.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 28087

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
