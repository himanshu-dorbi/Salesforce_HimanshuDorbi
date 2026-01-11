package week1Assignment;

public class User extends Person {
    private String email;
    
    public User(int userId, String name, String email){
    	super(userId,name);
    	this.email= email;
    	
    }
    
    public void getDetails() {
    	System.out.println("\nuserid:"+id + " username:"+name+ " user email:"+email);
    }
}
