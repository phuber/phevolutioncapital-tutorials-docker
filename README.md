# ph Evolution Capital / Tutorials / Docker
This repo provides a Hello Word Example for containerizing Java Spring Boot Applications with docker. 

## Prerequisites
- [Docker](https://www.docker.com/get-started) must be installed, docker daemon must be up and running

## Build container image with docker build:
- mvn package
- mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
- cp src/main/resources/Dockerfile .;docker build -t phevolutioncapital/tutorials/docker .

## OR: Build container image with mvn spring-boot plugin:
- mvn spring-boot:build-image -Dspring-boot.build-image.imageName=phevolutioncapital/tutorials/docker

## Run container:
- docker run -p 8080:8080 [IMAGE NAME]

## Success: 
Open localhost:8080 in your browser and you'll see "Hallo Welt!". 
