FROM openjdk:11
ADD target/springboot-mongo-docker-demo.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]