FROM openjdk:8
ADD target/spring-boot-mysql-2.jar spring-boot-mysql-2.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","spring-boot-mysql-2.jar"]
