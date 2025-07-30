package isp.entities;
import java.util.*;

public class PlanService {
	
	
 public void sortbycost(List<Plan>list) {
	 Collections.sort(list, new Comparator<Plan>(){
		 @Override
		 public int compare(Plan p1, Plan p2) {
			 return Integer.compare(p1.getCost(), p2.getCost());
		 }
	 });
 }
	 
	 public void sortbyspeed(List<Plan>list) {
		 Collections.sort(list, new Comparator<Plan>(){
			 @Override
			 public int compare(Plan p1, Plan p2) {
				 return Float.compare(p1.getSpeed(), p2.getSpeed());
			 }
		 });
 }
}
