package week3.day2;
import java.util.*;

public class listExample {

	public static void main(String[] args) {
		List<Integer>list= new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		int size = list.size();
		int i=0;
		int j=size-1;
		while(i<j) {
			int temp = list.get(j);
			list.set(j, list.get(i));
			list.set(i, temp);
			i++;
			j--;
		}
		
		System.out.println(list);

	}

}
