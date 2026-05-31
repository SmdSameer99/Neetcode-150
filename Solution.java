public class Solution {

    public static boolean isOneBitCharacter(int[] bits) {
        int i=0;

        for( i=0; i < bits.length - 1;){
            if(bits[i] == 1){
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == bits.length - 1;
    }

     public static int[] plusOne(int[] digits) {
       int len = digits.length;
    int carry = 1;
       for(int i = len-1; i>=0;i--){
         if (digits[i] < 9) {
                digits[i]++;
                return digits;
        } digits[i]=0;
    }
     int[] newDigits = new int[len + 1];
        newDigits[0] = 1; // The new most significant digit is 1
        
        return newDigits;
       

    }
    public static void main(String[] args) {
         int bits[] = {9, 9, 9, 9};
        // System.out.println(isOneBitCharacter(bits));

int ans[] = plusOne(bits);

for(int i: ans){
    System.out.println(i);
}
    }
}