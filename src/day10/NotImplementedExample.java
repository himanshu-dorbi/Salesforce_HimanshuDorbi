package day10;

class NotImplementedException extends RuntimeException{
	public NotImplementedException(String s){
		super(s);
	}
}



public class NotImplementedExample {
	
	void print() {
		throw new NotImplementedException("exception caught");
	}

	public static void main(String[] args) {
		try {
			NotImplementedExample obj = new NotImplementedExample();
			obj.print();
		}catch(NotImplementedException e) {
			System.out.println(e.getMessage());
		}

	}

}
