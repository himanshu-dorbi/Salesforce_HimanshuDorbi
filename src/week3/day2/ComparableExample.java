package week3.day2;
import java.util.*;

class student implements Comparable<student>{
	int id;
	String name;
	
	student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(student s) {
		return this.id-s.id;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		List<student>list = new ArrayList<>();
		list.add(new student(121,"ram"));
		list.add(new student(109,"shyam"));
		list.add(new student(101,"himanshu"));
		
		Collections.sort(list);
		
		for(student it: list) {
			System.out.println(it.id + " "+ it.name);
		}
		
		

	}

}
