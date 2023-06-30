FROM amazoncorretto:8-alpine-jdk

MAINTAINER MarcosDanielM

COPY target/mdm-0.0.1-SNAPSHOT.jar mdm-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/mdm-0.0.1-SNAPSHOT.jar"]