/*
 ‘final’ methods
    A final method cannot be overridden by subclasses. 
    This is useful for ensuring that the behavior of a method remains consistent across all subclasses.
    A final class cannot be subclassed. 
    This is useful for creating immutable classes or classes that should not be extended for security or design reasons. 
    The final keyword when used in class declaration, prevents inheritance and ensures the class's implementation cannot be altered by subclasses.
 */

public final class ImmutableClass {
  private final String name;
 
     public ImmutableClass(String name) {
         this.name = name;
    }

  public String getName() {
        return name;
     }
 }
// class SubClass extends ImmutableClass { // This would cause a compilation error
// }