package day10;
import java.io.*;

//class myException extends Exception{
//	myException(String s) {
//		super(s);
//	}
//}

public class CustomException {
	
	public static void check(int a) throws ArithmeticException {
		
			int x = a/0;
	}

	public static void main(String[] args) {
	      try {
	    	  check(100);
	      }catch(ArithmeticException e) {
	    	  System.out.println("Exception-"+e.getMessage());
	      }

	}

}
