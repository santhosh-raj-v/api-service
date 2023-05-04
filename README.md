# springboot-sample-app

Build Status(circleci or codebuild)
Coverage Status
Soanrqube 

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

```ide
mvn spring-boot:run
```


```shell
mvn spring-boot:run
```

## Deploying the application to AWS 
This will create:

* Docker Image
* Updaload DImage to ECR Repository
* Create a new Task Definition (revision)
* Update ECS Service 

## Copyright
