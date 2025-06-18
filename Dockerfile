FROM openjdk:21
LABEL authors="benja"

COPY target/openpostaluy-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]