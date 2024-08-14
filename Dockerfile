FROM openjdk:21-jdk-slim

MAINTAINER mishramanu26119972@gmail.com

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]