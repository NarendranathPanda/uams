FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/uams
COPY 'target/uams-0.0.1-SNAPSHOT.war' /usr/uams/
RUN chmod -R 777 /usr/uams
WORKDIR /usr/uams/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","uams-0.0.1-SNAPSHOT.war"]