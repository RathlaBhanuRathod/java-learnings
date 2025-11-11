public class Exercises01 {
    public static void main(String[] args) {
        //1.Write a Java program that takes two numbers as input and prints their sum, difference, product, and quotient.
        int num1 = 20;
        int num2 = 10;
        System.out.println("Sum : "+ sum(num1,num2));
        System.out.println("Substract : "+ substract(num1,num2));
        System.out.println("Mulitpy : "+ multiply(num1, num2));
        System.out.println("Quotient : "+ divide(num1, num2));

        // Write a program that takes a number as input and checks whether it is positive, negative, or zero using an if-else statement.
        int number = -5;
        if(number>0){
            System.out.println("Its a positive number");
        }else if(number<0){
            System.out.println("Its a negative number");
        }else{
            System.out.println("Its a zero");
        }

        /*
         3.Write a Java program that calculates the grade based on a student's percentage using an if-else-if ladder:
            90 and above → "A"
            80 - 89 → "B"
            70 - 79 → "C"
            60 - 69 → "D"
            Below 60 → "F"
        */
        int marks=88;
        if(marks>=90){
            System.out.println("Grade A");
        }else if(marks >=80 && marks <=89){
            System.out.println("Grade B");
        }else if(marks >=70 && marks <=79){
            System.out.println("Grade C");
        }else if (marks >=60 && marks <=69){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    // 4. Write a Java program using a switch-case statement to take a day number (1-7) as input and print the corresponding day of the week (1 = Monday, 2 = Tuesday, ..., 7 = Sunday).
    int dayOfWeek = 5;
    String day;
    switch (dayOfWeek) {
        case 1:
            day="Monday";
            break;
        case 2:
            day="Tuesday";
            break;
        case 3:
            day="Wednesday";
            break;
        case 4:
            day="Thursday";
            break;  
        case 5:
            day="Friday";
            break;
        case 6:
            day="Saturday";
            break;
        case 7:
            day="Sunday";
            break;
        default:
            day="Invalid day";
            break;
    }
    System.out.println("The day of week is : "+day);

    // 5. Write a Java program that prints the first 10 Fibonacci numbers using a loop.
    // 6. Write a Java program that finds the first 5 multiples of 7 using a loop and exits when the number exceeds 50 (use break statement).
    // 7. Write a Java program that skips printing multiples of 5 between 1 and 50 (use continue statement).
    // 8. Write a Java program that takes 5 numbers as input from the user, stores them in an array, and prints the sum and average.
    // 9. Write a Java program that finds the largest and smallest numbers in an array.
    // 10.Write a Java program that checks if a given number is present in an array (linear search).
    // 11.Write a Java program to initialize and print a 3x3 matrix.
    // 12.Write a Java program that adds two 3x3 matrices.
    
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
