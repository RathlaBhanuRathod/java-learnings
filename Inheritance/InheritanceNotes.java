package Inheritance;

/*
Introducing inheritance
    Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class to inherit the properties and behaviors (fields and methods) of an existing class.
    When a class extends another class it inherits all non-private members, including fields and methods. 
    This existing class is known as the superclass (or parent class), and the new class is referred to as the subclass (or child class). 
    
    Inheritance defines “is-a” relationship between a super class and its sub class. 
    Super class defines common traits for a set of related entities. 
    Sub class is a specialized version of super class. 
    
    The extends and implements keywords are used to achieve inheritance in Java. 
    extends keyword is used when one class is inheriting from another class or one interface is inheriting from another interface. 
    Implements keyword is used to inherit one interface in a class:

    Inheritance promotes code reuse and establishes a natural hierarchical relationship between classes, which can simplify the design and implementation of complex systems. 
    With inheritance, subclasses can extend the functionality of super classes by adding new fields and methods or by overriding existing methods to provide specific implementations. 
    This capability is crucial for achieving polymorphism, where a subclass instance can be treated as an instance of its superclass, enabling more flexible and maintainable code.

    The general syntax of a class declaration to inherit from a super class is:

    class subClassName extends superClassName{
    // class implementation
    }
Types of inheritance
    Java supports various types of inheritance, including 
    single inheritance (where a subclass inherits from one superclass), 
    multilevel inheritance (where a class is derived from another derived class), 
    hierarchical inheritance (multiple subclasses inherit from a single superclass), and 
    hybrid inheritance (a combination of two or more types, usually implemented through interfaces to avoid the limitations of multiple inheritance).

*/

public class InheritanceNotes {
    public static void main(String[] args) {
        // Create an instance of Vehicle class
        Vehicle vehicle = new Vehicle("Toyota", 2020);
        vehicle.displayInfo();

        // Create an instance of Car class
        Car car = new Car("Honda", 2021, 15);
        car.displayMileage();

        // Although the derived class inherits all members of the base class, it cannot
        // access the members of the base class, which are declared as private.
        // Create an object of the Car2 class
        Car2 myCar = new Car2("Honda", 2015, "Civic", 20000.0, 15);
        // Accessing members through the child class
        myCar.displayCarInfo();

        // Accessing public method to get private member value
        System.out.println("Price: " + myCar.getPrice());

        // Accessing protected method
        myCar.displayYear();

        // Accessing default method
        myCar.displayModel();

        // Private method can't be accessed from outside the class
        // myCar.displayPrice(); // This will cause a compilation error

    }
}

/* 
    The main class which contains the main method to run the program. 
    main method creates an instance of Vehicle and calls its displayInfo() method. 
    It also creates an instance of Car, calls its displayInfo() method (inherited from Vehicle), and calls its displayMileage() method.


    The brand and getPrice() are public members, so can be accessed from both the Car2 class and the this class. 
    Protected members (year and displayYear()) are accessible within the same package and subclasses. 
    In this example, year and displayYear() can be accessed from the Car class because it is a subclass of Vehicle. 
    Default members, which are also known as Package-Private (model and displayModel() in this example), are accessible only within the same package, so they are accessible from Car2. 
    Private members (price and displayPrice()) are accessible only within the same class. 
    In this example, price and displayPrice() cannot be accessed directly from the Car2 class or any other class outside Vehicle2. 
    However, the price can be accessed indirectly through the public method getPrice().
*/
