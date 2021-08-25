# library-management
This is a spring boot based API used to manage all of the day to day activities of Library.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.assessment.librarymanagement.LibraryManagementApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## API specifications

Application exposes the following rest endpoints

- GET /api/books - Retrieve all books.
- POST /api/books - Create a new book.
- GET /api/books/{name} - Retrieve a specific book by name. 


