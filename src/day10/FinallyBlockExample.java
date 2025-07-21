package day10;

public class FinallyBlockExample {

	public static void main(String[] args) {
		try {
			int a = 100/0;
		}catch(ArithmeticException e) {
			System.out.println("airthmatic error");
			
		}finally {
			System.out.println("run everytime");
		}
		

	}

}
