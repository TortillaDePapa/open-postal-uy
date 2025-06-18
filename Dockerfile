FROM openjdk:17
LABEL authors="benja"

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]