FROM openjdk:11
WORKDIR usr/src
ADD  ./target/spring-config-server-0.0.1-SNAPSHOT.jar /usr/src/spring-config-server-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-config-server-0.0.1-SNAPSHOT.jar"]
