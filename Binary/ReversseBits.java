public class ReversseBits {
    
    public static void main(String[] args) {
        
        int num = 43261596; // Example input
        // int reversed = 0;
        
        // // n = n << 0;
        // int [] bits = new int[32];
        // int [] reversedBits = new int[32];
        // int index = 0;
        // while(num != 0){
        //     if((num & 1) == 1) bits[index] = 1;
        //     else bits[index] = 0;
        //     index++;
        //     num = num >> 1;
        // }

        // for(int i = 31; i >= 0; i--){
        //     reversedBits[31 - i] = bits[i];
        // }

        // for(int i = 0; i < 32; i++){
        //     if(reversedBits[i] == 1){
        //         reversed += (1 << i);
        //     }
        // }

        int reversed = 0;
        int s=0;
        for (int i = 0; i < 32; i++) {
            s = num % 2;
            reversed = reversed * 2 + s;
            num = num / 2;
        }

        System.out.println("Reversed bits value: " + reversed);
        
        // for(int i=0; i<32; i++){
        // System.out.println("Reversed bits: " + (1<<i));
        // }
    }
}
