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

    public static void main(String[] args) {
        int bits[] = {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }
}