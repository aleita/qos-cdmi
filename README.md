![INDIGO Logo](https://www.indigo-datacloud.eu/images/INDIGO_logo_transparent.png)

# INDIGO-DataCloud CDMI Server

This project ports the SNIA CDMI-Server reference implementation to a Spring Boot application.

## Requirements

* JDK 1.8+
* [Gradle 2.3+](http://gradle.org/)

## Build & Run

The project uses the Gradle build automation tool that will build one fat jar Spring Boot application.

```
gradle build
```

The CDMI server can run without any additional server deployment (Tomcat, JBoss, etc.).

To specify the server port use the ```--server.port=9000``` parameter, default 8080.

```
java -jar cdmi-server-0.0.1-SNAPSHOT.jar --server.port=9000
```