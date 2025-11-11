/*
‘static’ keyword
    static keyword is used to create class variable and class methods which can be accessed without an instance of a class. 
    The static keyword is used to indicate that a particular member belongs to the class itself rather than instances of the class.
    This means that static members are shared among all instances of the class. 
    The static keyword can be applied to variables, methods, blocks, and nested classes.

‘static’ variables
    static variables (also known as class variables) are variables declared with the static keyword. 
    They are shared among all instances of the class, meaning there is only one copy of the variable in memory, regardless of how many objects are created.
    static variables are initialized only once. static variable is used to represent the common property of a class.

‘static’ blocks
    static blocks are blocks of code that are executed when the class is loaded into memory. 
    They are used to initialize static variables or perform other static initialization tasks. 
    Static blocks are executed in the order they appear in the class. 
    Executed when the class is loaded. 
    Static block can be used to initialize static variables. 
    A class can have multiple static blocks

‘static’ methods
    static methods are methods declared with the static keyword. 
    They belong to the class rather than any instance, and therefore, they can be called without creating an instance of the class. 
    static methods can access static variables and other static methods directly. 
    These methods cannot access instance variables or instance methods directly. 
    Often used for utility or helper methods. 
    static method can be accessed using the class name.


 */


public class StaticKeywordExample {
    
    //static variable
    static int staticVariable;
    int instanceVariable;
    // Static block to initialize static variable
    static {
        staticVariable = 10;
        System.out.println("Static block executed.");
    }

    // Static method
    public static void displayStatic() {
        System.out.println("Static Variable: " + staticVariable);
     // Cannot access instanceVariable here
    }
 
    // Instance method
    public void displayInstance() {
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable); // Can access static variables
    }
 
    public static void main(String[] args) {
         // Accessing static method without creating an instance
        StaticKeywordExample.displayStatic();

         // Creating instances
        StaticKeywordExample obj1 = new StaticKeywordExample();
        obj1.instanceVariable = 20;
       obj1.displayInstance();
 
         StaticKeywordExample obj2 = new StaticKeywordExample();
        obj2.instanceVariable = 30;
         obj2.displayInstance();
  
          // Accessing static variable using class name
        System.out.println("Static Variable accessed via class name: " + StaticKeywordExample.staticVariable);
     }
}
