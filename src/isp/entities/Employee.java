package isp.entities;

public class Employee {
 private String id;
 private String name;
 private EmployeeType type;
 
 public Employee (String id, String name, EmployeeType type){
	 this.id = id;
	 this.name = name;
	 this.type = type;
 }
 
 public void showUser() {
	 System.out.println("employee id-"+id + " employee name-"+name + " employee type-"+type);
 }

}
