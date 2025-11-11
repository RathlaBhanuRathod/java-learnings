/*
 Object access modifiers
        Object access modifiers in Java play a crucial role in encapsulation, a core concept of object-oriented programming (OOP). 
        They control the visibility of classes, methods, and variables, thereby defining how the components of a class can be accessed from other parts of the program. 
        The access level or visibility of classes, methods, and variables is defined by access modifiers. 
        They control where a particular class, method, or variable can be accessed from. 
        The four main access modifiers in Java are 
            private, 
            default (no modifier), 
            protected, and
            public.
Private access modifier
    The private access modifier is the most restrictive access level. 
    When a member is declared private, it is accessible only within the class in which it is declared. 
    private helps encapsulate an object's internal state, meaning that the internal workings of a class are hidden from the outside world. 
    This allows for better control over how the data is accessed and modified. 
    It prevents unauthorized or unintended access to the internal components of a class, ensuring that the data can only be accessed or modified through well-defined methods.
Default access modifier
    When no access modifier is specified, the member has default (also known as package-private) access. This means it is accessible only within the same package.
    Usage: Default access modifier is used when you want to allow access to classes within the same package but restrict access from outside the package.
    Access: Default members are accessed only within the same package.

Protected access modifier
    The protected access modifier allows the member to be accessible within the same package and by subclasses(A subclass is class that "extends" (inherits from) from other class or parent class.) (even if they are in different packages).
    Usage: Protected access modifier is used when you want to allow access to subclasses and classes within the same package.
    Access: Protected members are available within the same package and by subclasses in other packages.
Public access modifier
    The public access modifier allows the member to be accessible from any other class:
    Usage: Public access modifier is used when you want to make the member accessible from any other class.
    Access: public members are available from any other class in any package.
 */

public class AccessModifiers {
    // Private Access Modifier
    private int privateVariable;
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Default Access Modifier
    int defaultVariable;
    void defaultMethod() {
        System.out.println("Default method");
    }

    // Protected Access Modifier
    protected int protectedVariable;
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Public Access Modifier
    public int publicVariable;
    public void publicMethod() {
        System.out.println("Public method");
    }
       
    
}


/*
 Modifier       Class  in same Package  Subclass called in same package  subclass called in other packages  other package/World
    private      Y          N                 N                                 N                               N
    default      Y          Y                 Y                                 N                               N
    protected    Y          Y                 Y                                 Y                               N
    public       Y          Y                 Y                                 Y                               Y
 */