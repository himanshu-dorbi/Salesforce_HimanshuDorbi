package day10;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		try {
			int []arr = new int[5];
			arr[10]=100;
			
		}catch(ArithmeticException e) {
			System.out.println("airthmatic error");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of index");
			
		}catch(Exception e) {
			System.out.println("other");
			
		}

	}

}
