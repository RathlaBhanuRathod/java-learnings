/*
 Multiple if structure
    This contains a series of multiple if statements. Each condition is evaluated independently, regardless of the outcomes of the previous conditions. If one condition evaluates to true, the corresponding block of code associated with that if statement executes, and then the program moves on to the next statement:

    if (condition1) {
      // Code block 1
    }
   if (condition2) {
     // Code block 2
     }
     if (condition3) {
         // Code block 3
    }
     // And so on...
    In this scenario, each condition is checked sequentially, and multiple blocks of code may execute if multiple conditions are true.
 */

public class MultipleIfExample {
    public static void main(String[] args) {
        int number=10;
         // Checking conditions using multiple if statements
        if(number>0){
            System.out.println("Number is positive");
        }
        if(number%2==0){
            System.out.println("Number is even");

        }
        if(number%5==0){
            System.out.println("Number is divisable by 5");
        }
    }
}
