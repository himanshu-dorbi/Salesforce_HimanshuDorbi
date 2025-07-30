package isp.entities;
import isp.exceptions.PlanNotFound;

public class Plan {
  private String planid;
  private String planType;
  private float speed;
  private float limit;
  private int cost;
  
  public Plan(String planid, String planType, float speed, float limit, int cost) throws  PlanNotFound {
	  if(planid.trim().isEmpty()) {
		  throw new  PlanNotFound("plan id cant be null");
	  }
	  
	  if(speed<=0) {
		  throw new  PlanNotFound("speed must be greater then 0");
	  }
	  this.planid = planid;
	  this.planType= planType;
	  this.speed = speed;
	  this.limit = limit;
	  this.cost = cost;
  }
  
  public String getPlanType() {
	    return planType;
	}

	public float getSpeed() {
	    return speed;
	}

	public float getLimit() {
	    return limit;
	}

	public int getCost() {
	    return cost;
	}

  
  public void showPlan() {
	  System.out.println("type:"+planType + " cost: "+ cost +" speed:"+speed + " limit:"+limit);
  }
  
}
