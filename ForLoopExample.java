/*
for loop
The for loop allows you to execute a block of code repeatedly based on a specified condition:

   for (initialization; condition; update) {
      // code block to execute repeatedly
   }
    It consists of three sections: 
        initialization, 
        termination condition, 
        and update expression. 
    These sections work together to control the execution of the loop, 
    allowing you to iterate over a block of code repeatedly until a specified condition is met. 
    The initialization section is where you initialize the loop control variable. 
    This variable will be used to iterate through the loop. 
    This section is executed only once, at the beginning of the loop. 
    The termination condition is a Boolean expression that determines whether the loop should continue executing. 
    As long as the condition evaluates true, the loop will continue executing. 
    If the condition evaluates to false, the loop terminates, and the program proceeds to the next statement after the loop. 
    The update expression is responsible for updating the loop control variable after each iteration of the loop.
 */

public class ForLoopExample {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++) {
          System.out.println(num+"*"+i+"="+num*i);  
        }
    }
}
