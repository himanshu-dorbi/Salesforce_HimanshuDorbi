package day10;
import java.io.*;

class parent{
	void show() throws IOException{
		System.out.println("parent class method");
	}
}

class child extends parent{
	void show() throws FileNotFoundException{
		System.out.println("child class method");
	}
}

public class ThrowsWithOverridingExample {

	public static void main(String[] args) throws IOException {
		parent obj = new child();
		obj.show();
		child c = (child)obj;
		obj.show();
	}

}
