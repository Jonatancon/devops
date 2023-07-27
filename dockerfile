FROM openjdk:11-jdk-slim
COPY build/libs/devops-0.0.1-SNAPSHOT.jar java-app.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "java-app.jar"]
