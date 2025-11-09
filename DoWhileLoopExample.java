/*
do-while loop
 The do-while loop is a control flow statement that repeatedly executes a block of code until a specified condition evaluates to false. 
 Unlike the while loop, which evaluates the condition before the loop body is executed, 
 the do-while loop executes the loop body first and then evaluates the condition. 
 This ensures that the loop body is executed at least once, even if the condition is initially false. 
 The structure of the do-while loop consists of the do keyword followed by the loop body enclosed in curly braces {}, 
 and then the while keyword followed by the loop condition in parentheses (). 
 The loop condition is evaluated after each iteration of the loop. 
 During each iteration, the loop body is executed, and then the loop condition is evaluated. 
 If the condition evaluates to true, the loop body is executed again, and the process repeats. 
 If the condition evaluates to false, the loop terminates, and program control moves to the next statement after the loop.

The do-while loop is useful in situations where you want to execute a block of code at least once, regardless of the initial condition. 
The general syntax of do-while loop is as follows:

    do {
       // code block to execute repeatedly
    } while (condition);
 */


public class DoWhileLoopExample {
   public static void main(String[] args) {
        int counter=1;
        do{
            System.out.println("Count is : "+counter);
            counter++;
        }while(counter<=5);
   } 
}
