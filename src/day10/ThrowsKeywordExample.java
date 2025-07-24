package day10;
import java.io.*;

public class ThrowsKeywordExample {
	public void show() throws FileNotFoundException {
		FileReader f1 = new FileReader("abc.txt");
	}

	public static void main(String[] args) {
		ThrowsKeywordExample x = new ThrowsKeywordExample();
		try {
			x.show();
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}

	}
//	f1.close();

}
