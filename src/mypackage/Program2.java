package mypackage;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double originalPrice, discountedPrice;
		String planType;

		System.out.print("Enter the original price: ");
		originalPrice = sc.nextDouble();

		System.out.print("Enter your plan type: ");
		planType = sc.next();

		// Calculate
		if (planType.equalsIgnoreCase("Premium")) {

			// Premium plan: 20% discount
			discountedPrice = originalPrice - (originalPrice * 0.20);
			System.out.println("You have 20% discount!");
		} else if (planType.equalsIgnoreCase("Normal")) {

			// Normal plan: 5% discount
			discountedPrice = originalPrice - (originalPrice * 0.05);
			System.out.println("You have 5% discount!");
		} else {
			System.out.println("Invalid plan type entered.");
			return;
		}

		System.out.println("Original Price: " + originalPrice);
		System.out.println("Discounted Price: " + discountedPrice);

		sc.close();
	}
}
