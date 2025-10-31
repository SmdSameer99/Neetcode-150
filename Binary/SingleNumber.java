public class SingleNumber {
    
    public static void main(String[] args) {
        int[] nums = {-1};
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println("Single number is: " + result);
    }
}
