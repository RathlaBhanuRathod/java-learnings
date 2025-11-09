/*
    When programming, controlling the flow of execution within loops and methods is essential for efficient and logical code. 
    The break, continue, and return statements are powerful tools in this regard. 
    The break statement is used to exit a loop prematurely, effectively breaking out of it when a certain condition is met. 
    The continue statement, on the other hand, skips the current iteration of a loop and moves on to the next iteration, allowing you to bypass specific logic without stopping the entire loop.
    Finally, the return statement is used within methods to exit the method and optionally return a value, ending the method's execution and sending control back to the calling function. 
    Understanding and utilizing these statements is crucial for writing clear, concise, and efficient code.

 */

public class BreakContinueReturnExamples {

    public static void main(String[] args) {
    
        //Break examples
        int[] array={1,2,3,4,5,6};
        int target=5;
        boolean found=false;
        for(int num:array){
            if(num==target){
                found=true;
            }
        }
        if(found){
            System.out.println("Target is in Array");
        }else{
            System.out.println("Target is not in Array");
        }

        //Continue example
        //Skipping the even numbers
        for(int num: array){
            if(num%2==0){
                continue;
            }
            System.out.println(num);
        }

        //Catting sum method which return some values;
        int value=sum(2,8);
        System.out.println(value);

    }

    //example of return
    public static int sum(int a, int b){
        return a+b;
    }
    
}
