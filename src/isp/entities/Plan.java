package isp.entities;
import isp.exceptions.PlanNotFound;

public class Plan {
  private String planid;
  private String planType;
  private float speed;
  private float limit;
  
  public Plan(String planid, String planType, float speed, float limit) throws  PlanNotFound {
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
  }
  
  public void showPlan() {
	  System.out.println("type:"+planType + " speed:"+speed + " limit:"+limit);
  }
  
}
