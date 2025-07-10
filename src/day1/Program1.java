package day1;

import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]original = new int[10];
		int[] reverse = new int[10];
		
		System.out.println("enter numbers-");
		for(int i=0;i<original.length;i++)
		{
			original[i]=sc.nextInt();
		}
		
		for(int i=0;i<original.length;i++) {
			reverse[i]= original[10-i-1];
		}
		
		for (int it : reverse) {
	            System.out.print(it+" ");
	    }
		sc.close();
		
		
	}

}
