package day10;
import java.io.*;
import java.util.Scanner;

public class IOExceptionAtRuntime {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name-");
		try {
		String file = sc.nextLine();
		 BufferedReader reader = new BufferedReader(new FileReader(file));
		 System.out.println(reader.readLine());
		 reader.close();
		}catch(IOException e) {
			System.out.println("404: file name not found");
		}
		 sc.close();
	}
 
}
