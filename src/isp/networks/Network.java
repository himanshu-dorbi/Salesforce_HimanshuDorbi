package isp.networks;
import java.util.*;

public interface Network {
   void showSpeed();
   void useData(String userId, int mb);
   List<String>topUsers(int n);
 
}
