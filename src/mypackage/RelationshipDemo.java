package mypackage;

class person{
	String name;
	int age;
	
	person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void displayInfo(){
		 System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	}
}

class address{
	String state;
	String city;
	
	address(String state, String city){
		this.state = state;
		this.city = city;
	}
	

    void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
    
}

    class employee extends person{ //IS-A relationship
    	int employeeId;
    	address addr; //HAS-A relationship
    	
    	employee(String name, int age, int employeeId, address addr ){
    		super(name,age);
    		this.employeeId = employeeId;
    		this.addr = addr;
    	}
    	
    	void displayEmployee() {
    		System.out.println("employee id : "+ employeeId);
    		displayInfo();
    		addr.displayAddress();
    	}
    	
    }
	
public class RelationshipDemo {
	public static void main(String[] args) {
		address addr = new address("rajasthan","jaipur");
		employee emp1 = new employee("himanshu",23, 304, addr);
		System.out.println("\nemployee details");
		emp1.displayEmployee();

	}

}
