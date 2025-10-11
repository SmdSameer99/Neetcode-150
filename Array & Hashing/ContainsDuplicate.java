import java.util.HashSet;

public class ContainsDuplicate {
    

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        
        System.out.println(checkContainsDuplicate(nums));
    }



    public static boolean checkContainsDuplicate(int[] nums) {
        // this is the brute force approach
        // time complexity is O(n^2)


        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        // }
        // if (count > 0) {
        //     return true;
        // } else {
        //     return false;
        // }

        // this is the optimal approach
        // time complexity is O(n)

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}