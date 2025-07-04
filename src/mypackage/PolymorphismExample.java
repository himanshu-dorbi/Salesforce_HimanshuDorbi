package mypackage;

class user{
	void showPlan() {
		System.out.println("normal user plan activated!!");
	}
	
	void showPlan(String type) {
		System.out.println("this is "+ type +" user");
		
	}
}

class PrimeUser extends user {
    @Override
    void showPlan() {
        System.out.println("prime user plan activated. access to all prime content!!");
    }
}

public class PolymorphismExample {
 public static void main(String[] args) {
	 
	 //overloading example
	 System.out.println("-- overloading example --");
	 user person1 = new user();
	 person1.showPlan("Normal");
	 person1.showPlan();
	
	 
	 //overriding example
	 System.out.println("-- overwriting example --");
	 user person2 = new PrimeUser();
	 person2.showPlan("Prime");
	 person2.showPlan();
	 
 }
 
}

