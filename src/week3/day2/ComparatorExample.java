package week3.day2;
import java.util.*;


class student{
	int id;
	String name;
	
	student(int id, String name){
		this.id = id;
		this.name=name;
	}

}

class sortbyname implements Comparator<student>{
	 public int compare(student s1, student s2) {
	        return s1.name.compareTo(s2.name);
	    }
}


public class ComparatorExample {

	public static void main(String[] args) {
		List<student>list = new ArrayList<>();
		list.add(new student(121,"ram"));
		list.add(new student(109,"shyam"));
		list.add(new student(101,"himanshu"));
		sortbyname obj = new sortbyname();
		
		Collections.sort(list,obj);
		
		for(student it: list) {
			System.out.println(it.id + " "+ it.name);
		}

	}

}
