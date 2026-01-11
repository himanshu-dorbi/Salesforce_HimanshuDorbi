package day1;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double originalPrice, discountedPrice;
		String planType;

		System.out.print("enter original price:");
		originalPrice = sc.nextDouble();

		System.out.print("enter plan type:");
		planType = sc.next();


		if (planType.equals("Premium")) 
		{
			discountedPrice = originalPrice-(originalPrice*0.20);
			System.out.println("you have 20% discount");
			
		} else if (planType.equals("Normal"))
		{
			discountedPrice = originalPrice-(originalPrice*0.05);
			System.out.println("you have 5% discount");
			
		} else
		{
			System.out.println("invalid plan type.");
			return;
		}

		System.out.println("original Price:"+ originalPrice);
		System.out.println("discounted Price:"+ discountedPrice);

		sc.close();
	}
}
