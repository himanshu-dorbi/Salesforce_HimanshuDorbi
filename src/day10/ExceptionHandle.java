package day10;
import java.io.*;

public class ExceptionHandle {

	public static void main(String[] args) {
		try {
			FileReader fl = new FileReader("abc.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
