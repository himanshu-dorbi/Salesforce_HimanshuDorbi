package isp.entities;
import isp.exceptions.InvalidUser;
import isp.networks.Network;

public class User {
  private String name;
  private String email;
  private int age;
  private Address address;
  private Network net;
  private Plan p;
  
  public User(String name, String email,int age, Address address, Network net, Plan p) throws InvalidUser {
	  if(age<18) {
		  throw new InvalidUser("must be 18 years old");
	  }
	  this.name = name;
	  this.email = email;
	  this.age = age;
	  this.address = address;
	  this.net = net;
	  this.p = p;
  }
  
  public void showUser() {
	  System.out.println("user name- "+name + " user email-"+email +" user age-"+age);
	  System.out.println("user address - "+address.getAddress());
	  System.out.print("user network-");
	  net.showSpeed();
	  System.out.print("user plan-");
	  p.showPlan();
  }

}
