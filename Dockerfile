FROM amazoncorretto:17.0.7-al2023-headless
WORKDIR /opt/app
ARG JAR_FILE=build/libs/ApiFirst-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]
