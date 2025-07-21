package isp;
import isp.entities.*;
import isp.exceptions.*;
import isp.networks.*;

public class MainApp {

	public static void main(String[] args) {
//		Network n3g = new Network3g();
//		n3g.showSpeed();
//		Network n4g = new Network4g();
//		n4g.showSpeed();
		
		Employee emp = new Employee("emp101","himanshu", EmployeeType.MANAGER);
		emp.showUser();
		Plan p1 = null;
		
		try {
			p1 = new Plan("p001 ","airtel pro plan",90,1000);
			p1.showPlan();
			
		}catch( PlanNotFound e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Address addr1 = new Address("jaipur","rajasthan");
			Network usernet1 = new Network3g();
//			Plan p1 = new Plan("p001 ","airtel pro plan",90,1000);
			User usr1 = new User("tanish","tanish@gmail.com",18,addr1, usernet1,p1);
			usr1.showUser();
			
		}catch(InvalidUser e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
