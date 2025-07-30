package isp.networks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Network4g implements Network {
	 private Map<String, Integer>mp = new HashMap<>();
    public void showSpeed() {
    	System.out.println("4g sim:1MB for 4g users");
    }
    public void useData(String userId, int mb) {
  	  mp.put(userId,mb);
    }
    
    public List<String>topUsers(int n){
  	  List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
  	  list.sort((e1, e2)->e2.getValue()-e1.getValue());
  	  List<String>res = new ArrayList<>();
  	  for(int i=0;i<n;i++) {
  		  res.add(list.get(i).getKey());
  	  }
  	  return res;
    }

}
