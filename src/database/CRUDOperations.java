package database;
import java.sql.*;
import java.util.*;

class CrudApp{
	private String url = "jdbc:mysql://localhost:3306/school";
	private String username = "root";
	private String password = "a3mjt4hupz";
	
	private Connection con;
	private Scanner sc=new Scanner(System.in);
	
	void connect(){
		try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,username,password);
		System.out.println("database connected succesfully");
		
		}catch(Exception e) {
		System.out.println(e.getStackTrace());
		}
	}
	
	void createUser() {
		try {
		System.out.println("enter user name-");
		String name = sc.nextLine();
		System.out.println("enter mail id-");
		String email = sc.nextLine();
		System.out.println("enter phone no-");
		String phone = sc.nextLine();
		
		String sql = "INSERT INTO customers(name,email,phone) VALUES (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, phone);
		ps.setString(3, email);
		
	    int rows = ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void viewUser() {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM customers");
			
			System.out.println("total customers - ");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+", "+rs.getString("name")+", "+rs.getString("email")+", "+rs.getString("phone"));
				
			}
			rs.close();
			st.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void updateUser() {
		try {
			System.out.println("enter customer id-");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter new name-");
			String name = sc.nextLine();
			System.out.println("enter new email-");
			String email = sc.nextLine();
			System.out.println("enter new phone no-");
			String phone = sc.nextLine();
			
			String sql = "UPDATE customers SET name =?,email=?,phone=? WHERE id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setInt(4, id);
			
			
			int rows = ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void deleteUser() {
		try {
			System.out.println("enter customer id to delete-");
			int id = Integer.parseInt(sc.nextLine());
			String sql = "DELETE FROM customers WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.close();
			int rows = ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void closeConnect() {
		try {
			if(con!=null) {
				con.close();
				System.out.println("database connection close");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

public class CRUDOperations {
	public static void main(String[] args) {
		CrudApp obj = new CrudApp();
		obj.connect();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
		    System.out.println("\n--- CRUD Menu ---");
            System.out.println("1. add customer");
            System.out.println("2. view customers");
            System.out.println("3. update customer");
            System.out.println("4. delete customer");
            System.out.println("5. exit");
            System.out.print("enter choice- ");
            
            choice = Integer.parseInt(sc.nextLine());
            
            switch(choice) {
            case 1:
            	obj.createUser();
            	break;
            case 2:
            	obj.viewUser();
            	break;
            case 3:
            	obj.updateUser();
            	break;
            case 4:
            	obj.deleteUser();
            	break;
            case 5:
            	obj.closeConnect();
            	break;
            default:
            	System.out.println("invalid choice");
            }
		}while(choice!=5);
		
		sc.close();
		
	}
	

}
