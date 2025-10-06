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

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int nums[] = {3, 2, 4};
        int target = 6;
        int ans[] = obj.twoSum(nums, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}