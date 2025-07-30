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
		
		List<Plan>list = new ArrayList<>();
		try {
			   Plan p2 = new Plan("p001","4G",90,1000,399);
			   Plan p3 = new Plan("p002","3G",200,500,199);
			   Plan p4 = new Plan("p003","5G",150,2000,599);
			   Plan p5 = new Plan("p004","2G",10,100,99);
			   list.add(p2);
			   list.add(p3);
			   list.add(p4);
			   list.add(p5);
			   
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("sorting by cost-");
		PlanService ps1 = new PlanService();
		ps1.sortbycost(list);
		for(Plan it: list) {
			it.showPlan();
		}
		
		System.out.println("sorting by speed-");
		PlanService ps2 = new PlanService();
		ps2.sortbyspeed(list);
		for(Plan it: list) {
			it.showPlan();
		}
		
		
	}

}
