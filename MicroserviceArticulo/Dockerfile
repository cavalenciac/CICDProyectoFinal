FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceArticulo-1.0.0.jar client.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","client.jar" ]
