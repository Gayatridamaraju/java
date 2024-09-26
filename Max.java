package Gayi;

	/*static int arr []= {1,2,3,4};
	static int largest() 
    { 
        int i; 
         
        // Initialize maximum element 
        int max = arr[0]; 
         
        // Traverse array elements from second and 
        // compare every element with current max 
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
         
        return max; 
    } 

	public static void main(String[] args) 
    { 
        System.out.println("Largest in given array is " + largest()); 
    } 
} */
//Java Program to Find the Largest
//Element in the array using sort function
import java.io.*;
import java.util.*;
	// main function
public class Max {

	public static void main(String[] args)
	{
		int arr[] = { 12, 45, 67, 89, 100, 23,
					3456, 897, 452, 444, 899, 700 };
		
		// Sorting function using
		// Sort function
		Arrays.sort(arr);
	
		// Printing the Result
		System.out.println(
			"Largest number from given array: "
			+ arr[arr.length - 1]);
	}
}
