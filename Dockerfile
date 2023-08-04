#
# Build stage
#
FROM maven:3.8.3-openjdk-17-slim AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/BU-services-0.0.1-SNAPSHOT.jar BU-services.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","BU-services.jar"]
