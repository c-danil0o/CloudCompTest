FROM amazoncorretto:11
VOLUME /app
COPY target/movies-1.0.jar movies.jar
EXPOSE 8080
CMD ["java","-jar","movies.jar"]
