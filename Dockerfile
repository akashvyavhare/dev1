FROM openjdk:11
EXPOSE 8080
ADD target/dev1.jar dev1.jar
ENTRYPOINT [ "java","-jar","/dev1.jar" ]
