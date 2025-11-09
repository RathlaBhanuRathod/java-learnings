/*1. A basic Hello World program
  2. Save the file as HelloWorld.java
  */
/*
    In java a program consist of one or more classes, All the java code must be reside inside a class.
    The code must be stored in a file with same name as given in our class name in which the main() method is written.
    The case used in naming the class and file name should match becuase Java is case sensitive language.
    The file extension should be .java

*/
public class HelloWorld {
    /* 
     main() method is the entry point of the class
     */
    public static void main(String[] args){
        //Printing "Hello, World!"
        System.out.println("Hello, World!");
    }
    
}
/* 
 1) The source code should be compiled by using javac compiler. On the command line, it can be written as follows:
        javac HelloWorld.java
 2) The javac compiler creates a bytecode version of the program and saves it in a file HelloWorld.class. 
    This is an intermediate representation of the program, which can be ported to any JVM. 
    To execute the program, the java command can be used as shown below:
        java HelloWord
 3) We need to specify the name of the class which we want to execute with the java command. 
    It searches for a file with the given name and .class extension and executes the code.
    After execution, it will display the following output:
         Hello, World!
Structure of the program
Let us have a closer look at the structure of our first program.
    1) starting with /* is a multi line comment
    2) public class HelloWorld {} 
        This line defines a class named HelloWorld by using the class keyword. In Java, every program consists of one or more classes. 
        The entire code must be enclosed within opening curly brace ({) and closing curly braces (}).
    3) // is a single line comment
    4)  public static void main(String[] args) {
        Every Java program starts execution using the main method. It serves as the entry point of the program. 
        public static void main(String[] args) declares the main method. 
        public makes the method accessible from outside the class. 
        static indicates that the method belongs to the class itself, not to instances of the class.
        static keyword allows the main() method to be called by Java virtual machine without creating any object of the class. 
        void means that the method does not return any value.
        In the main method, there is only one parameter named String[] args, which declares a parameter named args, as an array of strings. 
        Arrays are collections of similar objects. String object can hold a set of characters.
        It is used to pass command-line arguments to the program while executing the program
    5)  System.out.println("Hello, World!");
        This line prints the string "Hello, World!" to the console. System.out refers to the standard output stream, typically the console. println is a method of the PrintStream class used to print a string followed by a newline character.
    6) This statement ends with a semicolon. In Java, each statement typically ends with a semicolon. This includes variable declarations, method calls, assignment statements, loop statements, and many others.
A program may have many classes. The classes may or may not contain main method. Java compiler can compile all those classes but cannot run a class without main(). Therefore, to launch a Java application, there should be at least one class with the main function.
 */
