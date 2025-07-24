package mealPlan;
import java.util.*;

class user{
	int id;
	String name;
	String pref;
	String meal;
	
	public user(int id, String name, String pref, String meal) {
		this.id = id;
		this.name = name;
		this.pref = pref;
		this.meal=meal;
	}
}

class customsort implements Comparator<user>{
	public int compare(user u1, user u2) {
		 List<String>meals = Arrays.asList("poha","idli","dal-makhani","raita");
		if(u1.pref.equals("veg") & u2.pref.equals("non-veg")) {
			return -1;	
		}else if(u1.pref.equals("non-veg") & u2.pref.equals("veg")) {
			return 1;
		}
		
		if(u1.pref.equals("veg") & u2.pref.equals("veg")) {
			int m1 = meals.indexOf(u1.meal);
			int m2 = meals.indexOf(u2.meal);
			if(m1 < m2) {
			    return -1;
			}else if (m1 > m2) {
			    return 1;
			}else {
			    return 0;
			}

		}
			return 0;
		}
}

public class MealPlanPackage {

	public static void main(String[] args) {
	    //user-> id, name, preference, meal;
		List<user>list = new ArrayList<>();
		list.add(new user(101,"himanshu","veg","dal-makhani")); //3
		list.add(new user(102,"prashant","veg","raita")); //4
		list.add(new user(103,"tanish","non-veg","poha")); //1
		list.add(new user(104,"subham","veg","idli")); //2
		customsort obj = new customsort();
		Collections.sort(list, obj);
		
//		System.out.println(list);
		for(user it: list) {
			System.out.println(it.name +" "+ it.pref +" "+ it.meal);
		}
	}
}
