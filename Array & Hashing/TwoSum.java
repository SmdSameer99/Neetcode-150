import java.util.HashMap   ;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        //int nums[] = {3, 3};
        int arrayLenght = nums.length;
        //int target = 6;
        for (int i=0; i<arrayLenght-1; i++) {
            for (int j = i+1; j < arrayLenght; j++) {
                if(nums[i]+nums[j] == target){
                    //System.out.println(i+" "+j);
                    int ans[] = {i, j};
                    return ans ;
                }
            }
        }
        return nums;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int remainderDiffernce  = target - nums[i];
            if(map.containsKey(remainderDiffernce)){
                return new int[] {map.get(remainderDiffernce), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }


    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int nums[] = {3, 2, 4};
        int target = 6;
        int ans[] = obj.twoSum(nums, target);
        System.out.println(ans[0]+" "+ans[1]);

        int ansOptimized[] = twoSumOptimized(nums, target);
        System.out.println(ansOptimized[0]+" "+ansOptimized[1]);
    }
}