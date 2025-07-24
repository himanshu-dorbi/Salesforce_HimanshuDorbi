package day10;
import java.util.Scanner;

public class ThrowWithMessageExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

//		System.out.println(num);
		
		try {
			if(y==0) {
                System.out.println("0 is not allowed in denominator");
			}else {
				int num = x/y;
				System.out.println(num);
			}
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
