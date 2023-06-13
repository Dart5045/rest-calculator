# Rest-Sanitas-Calculator
A simple calculator exposed as Rest API, built with Java 11 using Spring Boot.

## Run with java command
Run the Spring boot application with the java -jar command
```java -jar target/calculator-0.0.1-SNAPSHOT.jar```

## Run with Maven
If you have installed Maven on your machine, then use the following Maven command to run a Spring Boot application:
```$ mvn spring-boot:run```

## Performs

To perform a subs operation
http://localhost:8080/api/v1/calculate?number1=2&number2=3&operator=SUM

To perform an add operation
http://localhost:8080/api/v1/calculate?number1=2&number2=3&operator=SUBTRACTION