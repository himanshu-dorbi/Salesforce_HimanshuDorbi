package day4;

class A{
	static int count=10;
	static void test() {
		System.out.println("test method of class A");
	}
}

class B extends A{
	//@Override
	static void test() {
		System.out.println("test method class B");
	}
	
	static void display() {
		System.out.println("count :"+ count);
	}
}
public class CheckStatic {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.test();
		obj1.display();
	    A.count=100;
	    B.display();
	    

	}

}
