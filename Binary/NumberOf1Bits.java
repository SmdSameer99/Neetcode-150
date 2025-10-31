public class NumberOf1Bits {
    
    public static void main(String[] args) {
        
        int n = 11; // Example input
        int count = 0;
        while(n != 0) {

            System.out.println("\nCurrent number: " + n);
            System.out.println(" & 1 result: " + (n & 1));

            if((n & 1) == 1) count++;
            System.out.println(" >> Current bit: " + (n & 1));
            n = n >> 1; // Unsigned right shift
            
        }
        System.out.println("Total count of 1 bits: " + count);  

        System.out.println(" n = 10" + (int)(10 << 0));
    }
}
