package week3.day2;
import java.util.*;

public class collectionsExample {

	public static void main(String[] args) {
		String[] arr = {"ram","shyam","tarun","hariom"};
		List<String>list = Arrays.asList(arr);
		System.out.println(list);
		List<String>list1 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(list1);
		

	}

}
