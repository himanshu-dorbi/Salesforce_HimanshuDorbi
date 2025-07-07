package mypackage;

interface Network{
	void connect();
	void disconnect();
}

class Net2g implements Network{
	public void connect() {
		System.out.println("connected to 2g network!!");
	}
	
	public void disconnect() {
		System.out.println("2g netwrok disconnected!!");
	}
}

class Net3g implements Network{
	public void connect() {
		System.out.println("connected to 3g network!!");
	}
	
	public void disconnect() {
		System.out.println("3g netwrok disconnected!!");
	}
}

class Net4g implements Network{
	public void connect() {
		System.out.println("connected to 4g network!!");
	}
	
	public void disconnect() {
		System.out.println("4g netwrok disconnected!!");
	}
}

class Net5g implements Network{
	public void connect() {
		System.out.println("connected to 5g network!!");
	}
	
	public void disconnect() {
		System.out.println("5g netwrok disconnected!!");
	}
}



public class Program3 {
	
	public static void main(String[] args) {
		Network n1 = new Net2g();
		n1.connect();
		n1.disconnect();
		
		Network n2 = new Net3g();
		n2.connect();
		n2.disconnect();
		
		Network n3 = new Net4g();
		n3.connect();
		n3.disconnect();
		
		Network n4 = new Net3g();
		n4.connect();
		n4.disconnect();
	}

}
