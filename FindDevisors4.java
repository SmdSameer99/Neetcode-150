public class FindDevisors4 {
    
    public static int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int x: nums){
            ans+= checkDivisors(x);
        }
        return ans;
    }

    private static int checkDivisors(int x){
        int count = 2, sum = x + 1;  // 1 and x are always divisors
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                count++;
                sum += i;
                if(i * i != x){
                    count++;
                    sum += x / i;
                }
            }
        }
        return count == 4 ? sum : 0;
    }

    public static void main(String[] args) {
        int []nums = {21, 21};
        System.out.println(sumFourDivisors(nums));
    }
}
