FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080:8080
ADD ./target/springdocker-demo.jar springdocker-demo.jar
ENTRYPOINT ["java","-jar","springdocker-demo.jar"]