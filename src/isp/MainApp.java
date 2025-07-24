package isp;
import isp.entities.*;
import isp.exceptions.*;
import isp.networks.*;
import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		
		Employee emp = new Employee("emp101","himanshu", EmployeeType.MANAGER);
		emp.showUser();
		Plan p1 = null;
		
		try {
			p1 = new Plan("p001 ","airtel pro plan",90,1000, 399);
			p1.showPlan();
			
		}catch( PlanNotFound e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Address addr1 = new Address("jaipur","rajasthan");
			Network usernet1 = new Network3g();
			 usernet1.useData("tanish",500);
	         usernet1.useData("ayush",300);
	         usernet1.useData("tanish",200);
	         usernet1.useData("neha",150);
	         List<String>ans = usernet1.topUsers(2);
	         for(String it: ans) {
	        	 System.out.println(it);
	         }
			User usr1 = new User("tanish","tanish@gmail.com",18,addr1, usernet1,p1);
			usr1.showUser();
			
		}catch(InvalidUser e) {
			System.out.println(e.getMessage());
		}
		
		HashMap<Integer, Plan>mp = new HashMap<>(); 
		
		mp.put(1,p1 );
		
		
		
	}

}
