
public class SumOfTwoIntegers {

    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = (a ^ b) ;
            b = carry << 1;
            //System.out.println("Intermediate sum: " + a + ", carry: " + b);
        }
        return a;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int sum = getSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}