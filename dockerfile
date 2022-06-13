FROM openjdk:8
EXPOSE 8080
ADD target/Trainer-ws.jar Trainer-ws.jar
ENTRYPOINT ["java","-jar","/Trainer-ws.jar"]