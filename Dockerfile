FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/CircleAreaCalculator-1.0-SNAPSHOT.jar CircleAreaCalculator.jar
CMD ["java", "-jar", "CircleAreaCalculator.jar"]