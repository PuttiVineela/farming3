FROM openJDK:17-alpine
ADD target/productapp.jar productapp.jar
ENTRYPOINT["java","-jar","productapp.jar"]
EXPOSE 8080