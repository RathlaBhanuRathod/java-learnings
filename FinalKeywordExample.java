/*
‘final’ keyword
    The final keyword is used to apply restrictions on classes, methods, and variables. 
    When applied, it ensures that the entity it modifies cannot be changed or extended.

‘final’ variables
    A final variable can be a constant. 
    Once initialized, its value cannot be changed. 
    A final variable must be initialized when it is declared or in the constructor. 
    The value of a final variable cannot be modified once it is set. 
    Final variables can be used to define constants.
‘final’ methods
    A final method cannot be overridden by subclasses. 
    This is useful for ensuring that the behavior of a method remains consistent across all subclasses.
    A final class cannot be subclassed. 
    This is useful for creating immutable classes or classes that should not be extended for security or design reasons. 
    The final keyword when used in class declaration, prevents inheritance and ensures the class's implementation cannot be altered by subclasses.
 */

public class FinalKeywordExample {
    public static final double PI = 3.14159; // Final static variable
    public final int MAX_AGE;

    public FinalKeywordExample(int maxAge) {
            this.MAX_AGE = maxAge; // Final instance variable must be initialized
    }



    public static void main(String[] args) {
        FinalKeywordExample constants = new FinalKeywordExample(100);
            System.out.println("PI: " + PI);
            System.out.println("MAX_AGE: " + constants.MAX_AGE);
            // constants.MAX_AGE = 120; // This would cause a compilation error

            Child child = new Child();
            child.show(); // Output: This is a final method.

            ImmutableClass obj = new ImmutableClass("Immutable");
            System.out.println("Name: " + obj.getName()); // Output: Name: Immutable
    }
}


class Parent {
   public final void show() {
         System.out.println("This is a final method.");
    }
 }
 
 class Child extends Parent {
  // public void show() { // This would cause a compilation error
    //     System.out.println("Cannot override final method.");
     // }
 }
