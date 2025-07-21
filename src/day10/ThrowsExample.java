package day10;
import java.util.Scanner;

public class ThrowsExample {
	public static void balance(int debit, int amt) {
		if(debit>amt) {
			System.out.println("not allowed");
		}else {
			System.out.println("amt debit sucessfully");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int debit = sc.nextInt();
		int amt = sc.nextInt();
		System.out.println("himanshu");
		balance(debit,amt);
		sc.close();
	}

}
