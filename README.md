# Maprem ENSAK Projet

This project is created to get experience on **Microservices With Netflix OSS**. This is a simple project by coded imperative programming with simple business requirements.

## Used Netflix OSS

- **Netflix Eureka** is used for discovery service.
- **Netflix Ribbon** is used for client side load-balancing.
- **Netflix Zuul** is used for gateway.
  
## Microservices

| Service | EndPoint           | Port  | Method | Description                     |
| ------- | ------------------ | :---: | :----: | ------------------------------- |
| Users   | /api/v1/users/{id} | 7500  |  GET   | Return detail of specified user |
| Users   | /api/v1/users      | 7500  |  GET   | Return details of all acounts   |

## Gateways

| Service |          EndPoint           |
| ------- | :-------------------------: |
| Users   | **/user**/api/v1/users/{id} |
| Users   |   **/user**/api/v1/users    |

URI for gateway: *http://localhost:8762*
URI for eureka: *http://localhost:8761*


## Build & Run

```sh
curl -s "https://get.sdkman.io" | bash
sdk install java 11.0.12-open
sdk use java 11.0.12-open
sdk install maven 3.8.4
sdk use maven 3.8.4 
java -version
mvn -v
mvn install
./mvnw clean spring-boot:run # Run spring boot
```


- *>mvn clean package* : to build
- *>docker-compose up* --build : build docker images and containers and run containers
- *>docker-compose stop* : stop the dockerized services
- Each maven module has a Dockerfile.

In docker-compose.yml file:

- Users Service : **__2222__** port is mapped to **__7500__** port of host
- Eureka Discovery Service : **__8761__** port is mapped to **__8761__** port of host
- Spring Boot (/ Zuul) Gateway Service : **__8762__** port is mapped to **__8762__** port of host