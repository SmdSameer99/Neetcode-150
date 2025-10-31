public class CountBits {
    
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            result[i] = bitCount(i);
        }
        
        return result;
    }

    public static int bitCount(int num) {
        int count= 0;

        while(num != 0){
            if((num & 1) == 1) count++;
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        
        int n = 5;

        int[] result = countBits(n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
