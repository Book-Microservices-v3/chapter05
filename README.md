# Learn Microservices with Spring Boot 3 - Chapter 5
This repository contains the source code of the practical use case described in the book [Learn Microservices with Spring Boot 3 (3rd Edition)](https://link.springer.com/book/10.1007/978-1-4842-9757-5).
The book follows a pragmatic approach to building a Microservice Architecture. You start with a small monolith and examine the pros and cons that come with a move to microservices.

## Chapter 5 version

In Chapter 5, you add a persistence layer to the Multiplication's Spring Boot application, following the 3-layer, 3-tier design patterns. The figure below shows the data model for our application.

![Data Model](resources/data_model.png)

The main concepts included in this chapter are:

* Modeling Data Entities
* Introducing SQL vs NoSQL, Hibernate, and JPA.
* Covering the main topics about Spring Boot Data JPA, from a practical perspective.
* Defining JPA Entities for our use case.
* Reviewing how the 3 layers work together: Controller, Service, Repository.

All these topics are driven by a new feature that you introduce in the evolving app: retrieve the historical data for the attempts of a given user.

You use an H2 embedded database in the implementation, which means you don't need to install anything extra to run the complete system.

The next figure shows the logical view of our application at this stage.

![Logical View - Chapter 5](resources/app-layers-chapter5.png)

Check the [Book's Web Page](https://tpd.io/book-extra) to see the complete list of chapters.

## Running the app

Requirements:

* JDK 17
* Node.js v18.16.0
* npm 9.7.1

1. To start the Spring Boot application, you can use the command line with the included Maven wrapper:
    ```bash
    multiplication$ ./mvnw spring-boot:run
    ```
2. The React application can be started with npm. First, you need to download the dependencies with:
    ```bash
    challenges-frontend$ npm install
    ```
3. Then, you start the server with:
    ```bash
    challenges-frontend$ npm start
    ```

Once the backend and the fronted are started, you can navigate to `http://localhost:3000` in your browser and start resolving multiplication challenges. This time, you'll see a new table that displays your previous attempts.

![Application - Screenshot](resources/app-last-attempts.png)

Additionally, you can access the H2 Console if you want to manage or query the database. The console is located at [http://localhost:8080/h2-console](http://localhost:8080/h2-console). 

## Questions

* Do you have questions about how to make this application work?
* Did you get the book and have questions about any concept explained within this chapter?
* Have you found issues using updated dependencies?

Don't hesitate to create an issue in this repository and post your question/problem there. 
## Purchase
You can buy the book online from these stores:
* [Apress](https://link.springer.com/book/10.1007/978-1-4842-9757-5)
* [Amazon](https://www.amazon.com/Learn-Microservices-Spring-Boot-Containerization/dp/1484297563)
and other online stores.
