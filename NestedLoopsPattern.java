/*
Nesting of loops
Nesting loops refers to having one loop inside another loop. 
This is a common technique used in programming to perform repetitive tasks that require multiple levels of iteration. 
Here is an example of nesting loops in Java:
 */

public class NestedLoopsPattern {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
