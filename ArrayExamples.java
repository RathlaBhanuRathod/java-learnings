/*
Arrays
    An array is a data structure that allows you to store multiple values of the same type under a single variable name. 
    It provides a convenient way to manage collections of data elements of the same type.

    Arrays can be one-dimensional or multidimensional.
One-dimensional array
    A one-dimensional array in Java is a data structure that allows you to store a fixed-size sequence of elements, all of the same data type, in a linear form.
    Each element in the array is accessed using an index, with the first element at index 0, the second at index 1, and so on. 
    This structure is particularly useful when you need to store and manage a collection of related data, such as a list of numbers, names, or objects.
Multi-dimensional array
    A multi-dimensional array in Java is an array of arrays, where each element is itself an array, 
    allowing you to store data in a grid-like or matrix form. 
    The most common type is a two-dimensional array, which can be visualized as a table with rows and columns. 
    For instance, a two-dimensional array can be used to represent a matrix in mathematics, a chessboard in a game, or a table of student grades across different subjects.
    Multi-dimensional arrays are useful for managing and processing data that has more than one dimension, 
    such as images (where you might have rows and columns of pixels), or for performing operations in scientific computing, 
    where multiple variables need to be stored and manipulated together. 
    They allow for efficient organization and manipulation of data that inherently has multiple layers of information.
 */

public class ArrayExamples {
    
    public static void main(String[] args) {
      //Declaration and initialization
      int[] numbers; //declaration
      int[] num=new int[5]; // declaration of array whose length is 5  
      int[] a,b,c; //declaring 3 arrays of integer type.

      int[] prime = {2,3,5,7,11,13,17,19}; // declaration and asigning the values;

      int val = prime[4]; //accessing the 5th element of prime array index starts with 0
      System.out.println("Val : " +val);
      int size = prime.length; // size of Array;
      System.out.println(size);

    //iteration
    for(int i=0; i<prime.length;i++){
    System.out.println(prime[i]);   
    }

    // Enhanced for loop
    for (int value : prime) {
            System.out.println(value);
    }

    // Multi-demensional array;

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Print the 2D array in a matrix form
    System.out.println("The 2D array (matrix) is:");
    for (int i = 0; i < matrix.length; i++) {       // Loop through rows
        for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                 System.out.print(matrix[i][j] + " ");
        }
        System.out.println(); // Move to the next line after each row
    }

        
    }
}
