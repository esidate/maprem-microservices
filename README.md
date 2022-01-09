# Maprem ENSAK Projet

**Microservices With Netflix OSS**. This is meant to be a hello world project.

- **Netflix Eureka** for Service Discovery.
- **Netflix Ribbon** for Load-balancing.
- **Netflix Zuul** as an API Gateway.
 
## Setup

```sh
curl -s "https://get.sdkman.io" | bash
sdk install java 11.0.12-open
sdk use java 11.0.12-open
sdk install maven 3.8.4
sdk use maven 3.8.4 
java -version
mvn -v
mvn clean package
docker-compose up --build -d
docker-compose logs
docker-compose down
```

## Gateways

| Service |          EndPoint           |
| ------- | :-------------------------: |
| Users   | **/user**/api/v1/users/{id} |
| Users   |   **/user**/api/v1/users    |

URI for gateway: *http://localhost:8762*  
URI for eureka: *http://localhost:8761*

## Microservices

| Service | EndPoint           | Port  | Method | Description                     |
| ------- | ------------------ | :---: | :----: | ------------------------------- |
| Users   | /api/v1/users/{id} | 7500  |  GET   | Return detail of specified user |
| Users   | /api/v1/users      | 7500  |  GET   | Return details of all acounts   |

### Todo

- Add a database
- Add AuthN service
- Add AuthZ in API Gateway

