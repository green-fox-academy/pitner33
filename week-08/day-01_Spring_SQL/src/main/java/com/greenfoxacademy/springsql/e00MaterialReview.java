package com.greenfoxacademy.springsql;

public class e00MaterialReview {

//    ORM Object relational Mapping - making simplier to connect java to a database (tables and stuff will be generated automatically)
//    H2 - memory database - in testing the most important is to be fast - for that its good working in the memory. When you are testing you dont want to change your oroginal data nor create a false db - H2 will do it to you
//    JPA Java processing API (interface) -  Hibernate:  is the implementation of JPA we will use
//      @Entity
//      @Table (name = "<name to use>") - you can give a name to your table (name= not necessary?)
//        @Id - this will be the primary key
//        @Column - you can add but not mandatory
//        @GeneratedValue (strategy=GenerationType.AUTO) - auto increment the primary key
//     + we need a DEFAULT constructor!
//    Repository - a class called CatRepository - its the interface, extends CrudRepository(Cat, Long) (if you have a Cat class with Long ID
//    CrudRepository - a lots of useful methods
//    findOne()
//    findAll() - List<Cat> findAllByNameAndType(String name, String Type); the NameAndType made by me >)
//    save()
}
