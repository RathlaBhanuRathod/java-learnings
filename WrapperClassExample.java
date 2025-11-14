/*
Wrapper classes
    Wrapper classes in Java are a part of the java.lang package and are used to convert primitive data types into objects. 
    Each primitive data type (such as int, boolean, char, etc.) has a corresponding wrapper class (such as Integer, Boolean, Character, etc.). 
    These classes are useful because they allow primitives to be used in places where only objects are allowed, such as in collections (like ArrayList, HashMap, etc.) and in object-oriented programming constructs.
    
    Here is an overview of the primitive types and their corresponding wrapper classes:
    byte -> Byte
    short -> Short
    int -> Integer
    long -> Long
    float -> Float
    double -> Double
    char -> Character
    boolean -> Boolean
    
    The process of converting primitive data types to their corresponding wrapper class and vice versa is called autoboxing and unboxing.
    Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. 
        For example, converting an int to an Integer. 
    Unboxing is the reverse process, where the wrapper class is converted back to its corresponding primitive type.

    The following example shows the process:

    int primitiveInt = 5;
    Integer wrapperInt = primitiveInt;  // Autoboxing
    int anotherPrimitiveInt = wrapperInt;  // Unboxing
    
    Wrapper classes provide various utility methods for converting between different types, parsing strings into primitives, and more. For example:

    Integer.parseInt(String s): converts a string to an int.
    Double.toString(double d): converts a double to a String.
    Character.isDigit(char ch): checks if a character is a digit.

    All wrapper classes are immutable, meaning that once an object is created, it cannot be changed. 
        For example, once an Integer object is created with a value, that value cannot be modified. 
    Wrapper classes like Integer, Short, Byte, Character, and Long cache objects for certain ranges of values. 
        For example, Integer caches objects for values between -128 and 127. 
        This means that for these values, the same object reference is returned, which can improve performance.
 */

import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing: converting primitive to wrapper class
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing
        System.out.println("Wrapper Integer: " + wrapperInt);

        ArrayList<Integer> numbers = new ArrayList<>();
  
        // Autoboxing: converting int to Integer
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Unboxing: converting Integer to int
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;  // unboxing
        }
       
        System.out.println("Sum: " + sum);

        // Using utility methods
         int maxInt = Integer.MAX_VALUE;
        System.out.println("Max Integer Value: " + maxInt);

        // Using utility methods from wrapper classes
        String numberString = "30";
        int parsedInt = Integer.parseInt(numberString); // Parsing string to int
        System.out.println("Parsed int from string: " + parsedInt);

        double primitiveDouble = 45.67;
        String doubleString = Double.toString(primitiveDouble); // Converting double to string
        System.out.println("Double as string: " + doubleString);

        char character = '5';
        boolean isDigit = Character.isDigit(character); // Checking if character is a digit
        System.out.println("Is character a digit? " + isDigit);
    }
}
