
/*
Class
    Class can be defined as a template/blueprint that describes the behaviors/states of a particular entity. 
    It is the core of Java language. 
    A class defines a new data type. 
    Once defined, this new type can be used to create the object of that type. It is also known as a user-defined datatype.
Object
    Object is an instance of class. You may call it the physical existence of a logical template class
 A class contains both data (referred to as fields or variables) and methods (functions or behaviors) that define the characteristics and behaviors of objects instantiated from it.
 class members
    The data or variables defined within a class are called instance variables. The instance variables and methods are known as class members.
A class and an object can be related as follows: 
    Consider an ice tray (like a cube shape) as a class. 
    Then, ice cubes can be considered as the objects of the ice tray.
Declaring a Class
A class is declared using class keyword. A general form of class is shown below:

        class className{
        datatype instance-variable1;
        datatype instance-variable2;
        datatype instance-variableN;
        datatype method_name1(parameter_list)
        {
        //Method body
        }
        datatype method_name2(parameter_list)
        {
        //Method body
        }
        datatype method_nameN(parameter_list)
        {
        //Method body
        }
        }
The fields or variables of a class are referred to as properties of a class, which represent the attributes or data associated with objects created from that class.
The variable declared inside a class is called an instance variable because each instance of the class (i.e., each object) contains its own copy of these variables. 
Methods in a class are essentially functions that define the behavior or actions that objects of that class can perform. 
They encapsulate the logic and functionality related to the class, allowing objects to interact with each other and with external systems.
The dot operator is used to access instance variables and methods within an object. This is also called a membership operator.
See the Student class.

// Constructor
    A constructor is a special type of method that is called when an object is instantiated. 
    It is used to initialize the object's properties and allocate memory for the object. 
    The constructor has the same name as the class and does not have a return type.
    Unlike regular methods, constructors do not have a return type, not even void.
    If no constructor is defined in a class, the Java compiler automatically provides a default constructor that initializes the object with default values.
 */

public class ClassExamples {
    public static void main(String arg[]) {
        int total;
        Student std1=new Student();
        //assign values to std1's instance variables
        std1.rollno=1;
        std1.marks1=56;
        std1.marks2=74;
        std1.marks3=65;
        //compute total marks of student
        total = std1.marks1+std1.marks2+std1.marks3;
        System.out.println(" Total marks obtained :"+total);

        Student std2=new Student();
        //assign values to std2's instance variables
        std2.rollno=2;
        std2.marks1=66;
        std2.marks2=54;
        std2.marks3=57;
        //display total marks of student1
        std1.totalMarks();

        //display total marks of student2
        std2.totalMarks();

        //Return total marks of student1
        total=std1.returnTotalMarks();
        System.out.println(" Total marks obtained by Roll no 1:"+total);
        
        //Return total marks of student2
        total=std2.returnTotalMarks();
         System.out.println(" Total marks obtained by Roll no 2:"+total);

        // Assign values to std1's instance variables using method with parameters
        std1.setStudentDetails(1, 56, 74, 65);
        // Assign values to std2's instance variables using method with parameters
        std2.setStudentDetails(2, 66, 54, 57);
        // Display total marks of student1
        total = std1.returnTotalMarks();
        System.out.println("Total marks obtained by Roll no 1: " + total);
        // Display total marks of student2
        total = std2.returnTotalMarks();
        System.out.println("Total marks obtained by Roll no 2: " + total);
    }

}
/*
 As stated earlier, each object has its own copy of instance variables. 
 Therefore, in the above program, if two objects of Student class are created, both will have their own separate copies of instance variables. 
 Changes made in one object’s instance variable will not affect the instance variable of another object.

 A very important point to note here is in the method totalMarks().
 The instance variables in the method are referred to directly without any object name. 
 This is because a method is always invoked relative to an object of the class. 
 So, the instance variables of the object, which invoked the method, will be implicitly referred.

 Instead of directly accessing and setting the instance variables, we use the setStudentDetails method to set their values. 
 This encapsulates the data assignment process within the method, making the code more maintainable and readable. 
 The totalMarks method is then called on each Student object to calculate and print their total marks.
 
 By using a method to set values, we encapsulate the logic for setting instance variables, which promotes better coding practices. 
 The setStudentDetails method can be reused whenever we need to set the details of a Student object.
 Using methods with parameters makes the code more readable and easier to understand.
 */


