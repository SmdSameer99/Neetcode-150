public class MissingNumer {
    

    public static void main(String[] args) {
        
        int[] nums = {9,6,4,2,3,5,7,0,1};

        int n = nums.length;

        int  expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
