# Name:    aiyingshi-cloud-eureka
# Time:    2018-10-24

FROM openjdk:11.0.1-jre-slim-sid

MAINTAINER mark <mark@aiyingshi>

RUN mkdir /app

WORKDIR /app

COPY infrastructure-eureka-0.0.1-SNAPSHOT.jar /app

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/infrastructure-eureka-0.0.1-SNAPSHOT.jar"]

EXPOSE 8701