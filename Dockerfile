FROM openjdk:8
EXPOSE 8080
ADD target/github-actions-demo-v1.jar github-actions-demo-v1.jar
ENTRYPOINT ["java", "-jar", "/github-actions-demo-v1.jar"]