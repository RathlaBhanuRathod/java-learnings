/*
 Method overloading
    Method overloading is a feature in Java that allows a class to have more than one method with the same name, but different parameters. 
    These differences can be in the number of parameters, the type of parameters, or both. 
    Method overloading is a compile-time polymorphism feature, meaning the decision about which method to call is made at compile time.

    All overloaded methods must have the same name. 
    Overloaded methods must differ in the type, number, or both of their parameters. 
    The return type can be different for overloaded methods, but it alone is not sufficient for method overloading. 
    Method overloading is resolved at compile time based on the method signature (name + parameter list).

Benefits of method overloading
    The following are the benefits of method overloading:
        Code readability: Having multiple methods with the same name makes the code easier to read and understand.
        Code maintenance: It simplifies maintenance because the same logical method can perform different functions based on input parameters.
        Flexibility: It provides flexibility to handle different types of input parameters within the same method name.
 */


public class MethodOverloadingExamples {
    
    // Method to add two integers
    public int add(int a, int b) {
    return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
       return a + b + c;
    }
    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    //Another example of method overloading with sam   
    // Method to print a string
    public void print(String s) {
        System.out.println("String: " + s);
    }
    // Method to print an integer
    public void print(int i) {
        System.out.println("Integer: " + i);
    }
    
    // Method to print a double
    public void print(double d) {
        System.out.println("Double: " + d);
    }

    //Another example of method overloading with different number of parameters
    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
       return length * width;
    }
    
    // Method to calculate the area of a square
    public double area(double side) {
       return side * side;
    }
     
    public static void main(String[] args) {
         MethodOverloadingExamples moe = new MethodOverloadingExamples();
        
        System.out.println("Sum of two integers: " + moe.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + moe.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + moe.add(5.5, 10.5)); // Calls add(double, double)

        moe.print("Hello, World!"); // Calls print(String)
        moe.print(123); // Calls print(int)
        moe.print(12.34); // Calls print(double)

        System.out.println("Area of rectangle: " + moe.area(5.0, 10.0)); // Calls area(double, double)
        System.out.println("Area of square: " + moe.area(5.0)); // Calls area(double)
    }
}
