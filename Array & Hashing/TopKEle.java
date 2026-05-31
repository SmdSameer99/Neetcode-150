import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKEle {
    
    // using HashMap
    public static int[] findTopKEle(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {    
                // map.put(i, map.getOrDefault(i, 0)+1);
                
                // if(map.containsKey(i)){
                //     map.put(i, map.get(i)+1);

                map.merge(i, 1, Integer::sum);
        }
        System.out.println("map size " + map.size());

        int count = 0;
        for(int i : map.keySet()){
            System.out.println(i + " " + map.get(i));
            if(map.get(i) >= k){
                count++;
            }
        }
        System.out.println("count " + count);

        // List<Integer>[] bucket = new List[nums.length + 1];
        // for(int i=0; i<nums.length+1; i++){
        //     bucket[i] = new ArrayList<>();
        // }
        // for(int i : map.keySet()){
        //     System.out.println(i);
        //     int frequency = map.get(i);

        // }
        return null;
    }


    //using HashTree it will sort the key in ascending order
    // 1st Interger 
    public static int[] findTopKEle2(int[] nums, int k){
        Map<Integer, Integer> tMap = new TreeMap<>();

        for (int i : nums) {    
            tMap.merge(i, 1, Integer::sum);
        }

        System.out.println("map size " + tMap.size());

        for(int i : tMap.keySet()){
            System.out.println(i + " " + tMap.get(i));
        }
        
        return null;
    }


    public static void main(String[] args) {
        
        int[] nums = {2,2,1,1,1,2,2,3};
        int k = 2;

        int[] ans = findTopKEle(nums, k);

    }
}
