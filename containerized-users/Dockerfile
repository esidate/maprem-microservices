FROM openjdk:11-jdk-slim

ADD target/containerized-users.jar containerized-users.jar
ENTRYPOINT ["java", "-jar", "/containerized-users.jar"]
EXPOSE 2222