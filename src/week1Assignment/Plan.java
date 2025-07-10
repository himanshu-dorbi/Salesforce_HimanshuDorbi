package week1Assignment;

public class Plan {
	private int planId;
	private String planName;
	private int cost;
	
	public Plan(int planId, String planName, int cost) {
		this.planId = planId;
		this.planName = planName;
		this.cost = cost;
	}
	
	public void printDetails() {
		System.out.println("\nplan id:"+ planId+" plan name:"+planName +" plan cost:"+cost);
		
	}
 
}
