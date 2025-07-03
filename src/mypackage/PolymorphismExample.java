package mypackage;

class Subscription {
 public void plan() {
     System.out.println("Basic plan for all.");
 }

 public void plan(String planType) {
     System.out.println("Plan selected: " + planType);
 }
}

//Prime users
class PrimeUser extends Subscription {
 //runtime polymorphism
 @Override
 public void plan() {
     System.out.println("Special plan for Prime users with more advantages!");
 }

 //compile-time polymorphism
 public void plan(String planType, double discount) {
     System.out.println("Prime plan selected: " + planType + " with discount of " + discount + "%");
 }
}

//Normal users
class NormalUser extends Subscription {
 //runtime polymorphism
 @Override
 public void plan() {
     System.out.println("Standard plan for Normal users.");
 }
}

public class PolymorphismExample {
 public static void main(String[] args) {
	 
     Subscription user1 = new NormalUser(); // Normal user
     Subscription user2 = new PrimeUser();  // Prime user
     
     //runtime polymorphism
     System.out.println("\n--- Overwriting Demonstration ---");
     user1.plan();  // Calls NormalUser plan()
     user2.plan();  // Calls PrimeUser plan() (Override)
     
     //compile-time polymorphism
     System.out.println("\n--- Overloading Demonstration ---");
     user1.plan("Basic Plan"); // Calls Subscription plan
     ((PrimeUser) user2).plan("Prime Plan", 20.0); // Calls PrimeUser plan
 }
}

