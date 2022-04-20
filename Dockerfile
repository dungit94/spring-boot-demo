FROM openjdk:8-jdk-alpine
EXPOSE 8880
ARG JAR_FILE=build/libs/spring-boot-demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-boot-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-demo-0.0.1-SNAPSHOT.jar"]