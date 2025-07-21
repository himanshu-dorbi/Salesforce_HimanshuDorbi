package isp.entities;

public class Address {
	 private String city;
	 private String state;
	 
	 public Address (String city, String state){
		 this.city = city;
		 this.state=state;
	 }
	 
	 public String getAddress() {
		 return city +"" +state;
	 }

}
