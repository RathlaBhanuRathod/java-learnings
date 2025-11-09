/*
while loop
 The while loop repeatedly executes a block of code as long as a specified condition is true. 
 Its structure consists of four main components: 
    initialization, 
    condition checking, 
    loop body execution,
    and update of the control variable.
 */

public class WhileLoopExample {

    public static void main(String[] args) {
        int counter=1;
        while(counter<=5){
            System.out.println("Count is : "+counter);
            counter++;
        }
    }
    
}
