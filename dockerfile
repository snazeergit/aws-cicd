FROM openjdk:17-slim
WORKDIR /app
COPY target/welcome-service.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]