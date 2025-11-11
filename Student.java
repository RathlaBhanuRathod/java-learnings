import java.lang.reflect.Method;

public class Student {
    int rollno;
    int marks1;
    int marks2;
    int marks3;

    /*
     Adding methods to class
        we saw a class with instance variables, also called as properties of the class. 
        To access the properties, the class provides methods which implement the behavior of the class. 
        Methods provide an interface to class by allowing to hide the actual implementation details behind the cleaner method abstraction.
        Methods can be defined to access the data as well as for implementing the application logic.
     */

    //Display total marks of a Student
    public void totalMarks() {
        System.out.println(" Total marks obtained by Roll no :"+rollno);
        System.out.println(marks1+marks2+marks3);
    }
    /*
     Returning value from a method
        The totalMarks() method displays the computed total marks in the method itself that is within the class where it belongs. 
        Sometimes, we may need the value in other parts of our program. 
        In that case, the method should return the value to the caller. 
        The following code changed the returnTotalMarks() implementation to return the value:
     */

    public int returnTotalMarks() {
        return (marks1 + marks2 + marks3);  
    }

    //Method with parameters
     // Method to set student details (with parameters)
     /*
      setStudentDetails(int rollno, int marks1, int marks2, int marks3) method in the Student class is an example of a method with parameters. 
      It takes four parameters and sets the instance variables of the Student objects accordingly. 
      this keyword is used to refer to the current object's instance variables to avoid confusion with the method parameters.
      */
    void setStudentDetails(int rollno, int marks1, int marks2, int marks3) {
        this.rollno = rollno;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Constructor with parameters to initialize the instance variables
        public Student(int rollno, int marks1, int marks2, int marks3) {
            this.rollno = rollno;
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
        }

    // Default constructor
        public Student() {
        }


}

/*
 Benefits of using a constructor
    The following are the benefits of using a constructor:
            Automatic initialization: Constructors ensure that objects are properly initialized when they are created, reducing the likelihood of errors due to uninitialized variables.
            Code conciseness: Initialization code is centralized in the constructor, making the main code more concise and easier to read.
            Object-oriented design: Constructors promote a more object-oriented design by encapsulating the initialization logic within the class itself.
 */