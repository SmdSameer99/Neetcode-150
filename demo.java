public class demo {
     public long removeZeros(long num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '0') sb.append(c);
        }
        if (sb.length() == 0) return 0L;
        return Long.parseLong(sb.toString());
    }
    public static void main(String[] args) {
        long num = 1023450;
        long result = 0;

        // while (num > 0) {
        //     // if((num%10) != 0 ){
        //     //     result *= 10 ; 
        //     //     result += num % 10;
                               
        //     // }
            
        //     // num /= 10;

        //     System.out.println(num % 10);
        //     num /= 10;
        // }

        // for(int i=0; num>0; i++){
        //      System.out.println(num % 10 + " at position " + i);
        //     num /= 10;
        // }
        // System.out.println("Sum of digits: " + result);


        //Sloving method 2
        // System.out.println( String.valueOf(num).length() );

        // int numLen = String.valueOf(num).length();
        // for(int i=numLen-1; i>0; i--){
            
        //     long digit = (num / (int)Math.pow(10, i)) % 10;
           
        //     if(digit == 0) continue;
        //     System.out.println( digit + " at position " + i);
        //     result *= 10 ;
        //     result += digit;
        // }

        // System.out.println(result);

        //solving method 3
        System.out.println(new demo().removeZeros(11));
    }
}
