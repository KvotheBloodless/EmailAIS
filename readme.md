# EmailAIS

A simple tool that will accept data from a SignalK server and send it to Marine Traffic servers

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

### Prerequisites

- [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven](https://maven.apache.org/) - Dependency Management

## Running the tests

Tests are implemented using the Mockito and TestNG frameworks. Run using maven.

```
$ mvn clean compile test
```

### Build and package the application

```
$ mvn clean package
```

### Run the application

```
$ java -jar target/EmailAIS-[version].jar <options>
```

## Contribution guidelines
All are welcome to contribute in accordance with the licence. An approved pull request is required for merging to 
master.

## Authors

* ** Paul Willems [paul@venilia.com.au] ** - *Project owner*.

See also the list of [contributors](https://github.com/KvotheBloodless/EmailAIS/graphs/contributors) who 
participated in this project.
