package week1Assignment;

public class Employee extends Person {
	private Category c;
	
	public Employee(int id, String name, Category c) {
		super(id,name);
		this.c = c;
		
	}
	
	public void getDetails() {
    	System.out.println("\nemploye id:"+ id + " employee name:"+name + " emplyee type:"+c);
    }
	
          
}
