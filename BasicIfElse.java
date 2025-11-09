/*
    if …else statement
        Executes a block of code if a specified condition is true. Otherwise, executes an alternative block of code. The general syntax of an if-else block is as follows:

        if (condition) {
             // code block to execute if condition is true
        } else {
            // code block to execute if condition is false
        }
 */

public class BasicIfElse {
    public static void main(String[] args) {
        int num=5;
        if (num>0) {
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}
