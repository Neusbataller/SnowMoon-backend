FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY SnowMoon .

RUN chmod +x mvnw && ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/*.jar"]