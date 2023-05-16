FROM amazoncorretto:1.8

MAINTAINER Marcos Daniel Martinez

COPY target/mdm-0.0.1-SNAPSHOT.jar mdm-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/mdm-0.0.1-SNAPSHOT.jar"]