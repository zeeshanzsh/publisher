FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} publisher.jar
ENTRYPOINT ["java", "-jar", "/publisher.jar"]
EXPOSE 8080