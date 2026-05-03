FROM amazoncorretto:17
WORKDIR /app
COPY ./target/welcome-service.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "welcome-service.jar"]