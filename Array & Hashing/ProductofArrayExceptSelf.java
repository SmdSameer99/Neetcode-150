public class ProductofArrayExceptSelf {
    // public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // Step 1: Calculate prefix products and store directly in res
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        
        // Step 2: Use a rolling variable to calculate suffix products on the fly
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suffix; // prefix * suffix
            suffix *= nums[i];        // Update suffix for the next index to the left
        }
        
        return res;
    }
    public static void main(String[] args) {
        ProductofArrayExceptSelf sol = new ProductofArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
