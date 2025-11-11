/*
 'this' keyword
    The this keyword is a reference variable that refers to the current object. 
    It is used within an instance method or constructor to access members of the current object. 
    The this keyword helps in differentiating between instance variables and local variables or parameters, as well as invoking other constructors in the same class.

Uses of ‘this’ keyword
    To refer current class instance variables: When there is a naming conflict between instance variables and parameters or local variables, this is used to differentiate them.
    To invoke current class methods: You can use this to call another method of the current class. Although it is not mandatory, it can be used for clarity.
    To invoke current class constructor: This can be used to call one constructor from another constructor in the same class. This is known as constructor chaining.
    To return current class instance: A method can return the current class instance using this.
    To pass as an argument in method call: This can be passed as an argument in the method call.
    To pass as an argument in constructor call: This can be passed as an argument in the constructor call.
 */


public class ThisKeyword {

    //Example: To refer current class instance variables
        private String name;
        private int age;
        public ThisKeyword(String name, int age) {
         this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.age = age;   // 'this.age' refers to the instance variable, 'age' refers to the parameter
     }

    public void displayStudent() {
       System.out.println("Name: " + this.name + ", Age: " + this.age);
     }


    //Example: To invoke current class methods
    int a, b;
    public void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void displayValues() {
        System.out.println("a: " + a + ", b: " + b);
   }
 
    public void performTask() {
        this.setValues(10, 20); // Invoking method using 'this'
        this.displayValues();   // Invoking method using 'this'
    }
    //Example: To invoke current class constructor
    private int width, height, depth;
    public ThisKeyword() {
        this(10, 10, 10); // Invoking parameterized constructor
    }
    public ThisKeyword(int width, int height, int depth) {
       this.width = width;
       this.height = height;
        this.depth = depth;
    }

    public void displayDimensions() {
         System.out.println("Dimensions: " + width + "x" + height + "x" + depth);
    }
 

    //Example: To return current class instance
    private String field;
    public ThisKeyword setField(String field) {
        this.field = field;
        return this; // Returning current instance
    }
    public void displayBuilder() {
        System.out.println("Field: " + field);
    }

    //Example: To pass as an argument in method call
    int value;
    public ThisKeyword(int value) {
        this.value = value;
    }
 
    public void displayData(ThisKeyword obj) {
        System.out.println("Value: " + obj.value);
    }
 
     public void show() {
      displayData(this); // Passing 'this' as an argument
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword("John", 20);
        tk.displayStudent(); // Output: Name: John, Age: 20

        tk.performTask(); // Output: a: 10, b: 20


        tk.displayDimensions(); // Output: Dimensions: 10x10x10

        tk.setField("Value").displayBuilder(); // Output: Field: Value
        ThisKeyword tk1 = new ThisKeyword( 20);
        tk1.show(); // Output: Value: 20
    }

    
}
