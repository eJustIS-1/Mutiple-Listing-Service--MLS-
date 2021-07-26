# Multiple Listing Service (MLS)

This project is part of the Assignment of my EECS 2030 (Advanced Object Oriented Programming course). The project has been made from scratch which consists of around 20 classes.
The design and the implemantion are based on the best practices of object-oriented principles. It also displayes the practical use of encapsulation, inheritence, abscraction,
and polymorphism. 

In the main components of the project, a simplified residential MLS system is designed, implemented, and tests to create, update, and delete MLS Recors (CRUD Operations). 
The project also includes Singleton Design pattern inside which will be explained in the Singleton.Java part. 

Important part of the project are as follows:
  
  1. MultipleListingService.java
  2. Subclasses
  3. Singleton.java
  4. Test Cases
  

## MultipleListingService.java

* This class is used to record each MLS by UUID (Universally Unique Identification), address of the property, and the price of the building. 

* Also, this class is the most important class of the project because it is super class of the all subclasses that are extended from it 

## Subclasses 

* There are many subclasses are included in this project to demonstrate different types of properties.

* Object-Oriented Principles are maingly used in this part to design the project

* Some of the subclasses are Condominiums, Detached Homes, Freeholds, Townhouses,  Parking Spaces and so on. 

## Singleton.java

* Singleton Cache is a design pattern which are general, reusable pieces of code to help solve common problems with a given context.

* In this singleton design patter, the code creates cache to store the data that is recieved, and if the same data is asked to be used again, instead of going through
the entire process again, the cache can be used to retrieve the data in less time. 

* So, thanks to this design pattern, the project becomes faster and faster after the searches are done. Therefore, performance has increased. 

## Test Cases

* Lastly, JUnit test cases are used to check the program. For the purpose of testing all our classes, firstly we have pptytest.java file, which is the project version of
combiner

* pptytest.java class acts to combine and implement all the classes that are going to be created. 
