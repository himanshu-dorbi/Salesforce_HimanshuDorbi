package week1Assignment;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<User>users = new ArrayList<>();
		List<Employee>employees = new ArrayList<>();
		List<Plan>plans = new ArrayList<>();
		
		users.add(new User(101,"himanshu","himanshu@gmail.com"));
		users.add(new User(102,"ram","ram@gmail.com"));
		
		employees.add(new Employee(101,"himanshu",Category.FULL_TIME));
		employees.add(new Employee(102,"ram",Category.INTERN));
		
		plans.add(new Plan(1001,"basic plan",10000));
		plans.add(new Plan(1002,"premium plan",20000));
		
		for (User user : users) {
		    user.getDetails();
		}
		
		for (Employee emp : employees) {
		    emp.getDetails();
		}

		for (Plan plan : plans) {
		    plan.printDetails();
		}
		
		
		

	}

}
