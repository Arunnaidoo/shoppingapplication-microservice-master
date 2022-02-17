FROM openjdk
WORKDIR usr/lib
EXPOSE 9000
ADD ./target/MicroserviceApiGateway2-0.0.1-SNAPSHOT.jar /usr/lib/MicroserviceApiGateway2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","MicroserviceApiGateway2-0.0.1-SNAPSHOT.jar"]