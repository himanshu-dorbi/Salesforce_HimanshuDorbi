package day4;

class Abc{
	int age;
	String name;
	String address;
	
	public Abc(int age, String name, String address){
		this(name,address);
		this.age = age;
	}
	
	public Abc(String name, String address) {
		this.name = name;
		this.address=address;
	}
	
	public void show() {
		System.out.println("age-"+age);
		System.out.println("name-"+name);
		System.out.println("address-"+address);
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		Abc obj1 = new Abc(22, "Himanshu","officer colony, jaipur");
		Abc obj2 = new Abc(23, "tanish","capital galleria, jaipur");
		
		obj1.show();
		System.out.println("\n");
		obj2.show();

	}

}
