package day2;
class Plan{
	double planfees = 1000;
	
	void displayPlan(String x){
		System.out.println(x + " has plan fees -"+ planfees);
	}
}

class NormalPlan extends Plan{
	@Override
	void displayPlan(String x) {
		double discount =0.10;
		planfees = planfees*(1-discount);
		System.out.println(x + " is normal plan user with 10% discount -"+ planfees );
		
	}
}

class PrimePlan extends Plan{
	@Override
	void displayPlan(String x) {
		double discount =0.50;
		planfees = planfees*(1-discount);
		System.out.println(x +" is prime plan user with 50% discount  - "+ planfees );
		
	}
}


public class PolymorphismExample {
 public static void main(String[] args) {
	 String[] users = {"ram","shyam","prashant","himanshu","tanish"};
	 
	 for(int i=0;i<users.length;i++) {
		 Plan p;
		 if(i%2==0) {
			 p = new PrimePlan();
		 }else {
			 p = new NormalPlan();
		 }
		 p.displayPlan(users[i]);
	 }
	
	 
 }
 
}

