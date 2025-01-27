CRUD Operations Using Spring Boot Annotations and HQL

This document explains how to implement CRUD (Create, Read, Update, Delete) operations using Spring Boot Annotations along with HQL (Hibernate Query Language) for database interactions. HQL allows us to perform database operations in an object-oriented manner, enhancing the efficiency and maintainability of the application.

What is HQL?

HQL is a Hibernate-specific query language that allows you to interact with database entities rather than tables. It uses Java classes, fields, and relationships, making queries more object-oriented.

Key Spring Boot Annotations for CRUD

1. Controller Layer

Handles incoming HTTP requests and maps them to appropriate methods.

@RestController: Combines @Controller and @ResponseBody. It makes the class RESTful by returning JSON/XML responses.

@GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Simplify HTTP method-specific endpoint mapping.

2. Service Layer

Handles business logic and interacts with the repository layer.

@Service: Marks the class as a service layer component.

3. Repository Layer

Interacts with the database for performing CRUD operations.

@Repository: Indicates the class is a Data Access Object (DAO) that interacts with the database.

4. Repository Layer

@Entity: Specifies that the class represents a database table.

@Id: Marks a field as the primary key in the database.

@GeneratedValue: Indicates the primary key is auto-generated.
