FROM openjdk:22-jdk-slim

WORKDIR /app

COPY target/ax-lip-gateway.jar .

ENTRYPOINT ["java", "-jar", "ax-lip-gateway.jar"]

EXPOSE 9999