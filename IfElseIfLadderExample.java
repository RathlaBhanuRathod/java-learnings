/*
In an if-else ladder, multiple conditions are checked sequentially, but once a condition evaluates to true, only the corresponding block of code associated with that true condition executes. If none of the conditions are true, the code within the else block (if present) executes:

    if (condition1) {
      // Code block 1
     } else if (condition2) {
       // Code block 2
     } else if (condition3) {
       // Code block 3
     } else {
         // Default code block
     }
In this scenario, the conditions are evaluated one by one from top to bottom. If condition1 is true, Code block 1 executes, and the rest of the ladder is skipped. 
If condition1 is false and condition2 is true, Code block 2 executes, and so on. 
If none of the conditions are true, the code within the else block (if present) executes as the default behavior.
 */

public class IfElseIfLadderExample {
    
    public static void main(String[] args) {
        int num=75;

        if(num>=90){
            System.out.println("Grade A");
        }else if(num>=80){
            System.out.println("Grade B");
        }else if(num>=75){
            System.out.println("Grade C");
        }else if(num >=65){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
