package week3.day1;
import java.util.*;

public class SetCollection {

	public static void main(String[] args) {
		Set<String>s= new HashSet<>();
		s.add("basic plan");
		s.add("pro plan");
		s.add("enterprise plan");
		s.add("premium plan");
		
		System.out.println("set(first time)-"+s);
//		for(String it:s) {
//			System.out.println(it);
//		}
		
		System.out.println(s.contains("basic plan"));
		s.remove("basic plan");
		System.out.println(s.size());
		System.out.println(s.isEmpty());
//		System.out.println();
		s.clear();
		System.out.println("set (2nd time)-"+s);
		

	}

}
