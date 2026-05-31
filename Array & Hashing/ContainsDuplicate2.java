import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public static boolean checkContainsDuplicate(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();
        // int counter = 0;
        for(int i = 0; i < nums.length; i++){
            // counter++;
            if(map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)){
                return true;
            }
            map.put(nums[i], i);
            // counter++;

        
          
            
        }
        return false;
    }
    

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int k = 3;
        
        System.out.println(checkContainsDuplicate(nums,k));
    }
}
