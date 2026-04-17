FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia TODO el proyecto
COPY . .

# Entra en la carpeta donde está Maven
WORKDIR /app/SnowMoon

# Construye el proyecto
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Ejecuta el jar
CMD ["java", "-jar", "target/SnowMoon-0.0.1-SNAPSHOT.jar"]