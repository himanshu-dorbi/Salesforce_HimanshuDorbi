package mypackage;

import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        int[] originalArray = new int[10];
	        int[] reversedArray = new int[10];

            //input
	        System.out.println("Enter 10 integers:");

	        for (int i = 0; i < 10; i++) {
	            originalArray[i] = sc.nextInt();
	        }

	        //original array
	        for (int i = 0; i < 10; i++) {
	            reversedArray[i] = originalArray[9 - i];
	        }

	        //reverse array
	        System.out.println("Original Array:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(originalArray[i] + " ");
	        }

	        //output
	        System.out.println("\nReversed Array:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(reversedArray[i] + " ");
	        }

	        sc.close();

	}

}
