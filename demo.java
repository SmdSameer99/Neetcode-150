import java.util.List;

public class demo {


    public static void main(String[] args) {
        int [] numbers = {1, 4, 2, 5};
    
        fineMissingNumber(numbers);
    }

    private static List<Integer> fineMissingNumber(int[] numbers) {
    
        List<Integer> missingNumbers = new java.util.ArrayList<>();
        int max = 0, min = 0;
        for (int i = 0; i < numbers.length; i++) {
           if(numbers[i] > max){
               max = numbers[i];
           }
           if(numbers[i] < min || min == 0){
               min = numbers[i];
           }
        }

        
        System.out.println("Max: " + max + " Min: " + min);

        for(int j = min; j <= max; j++){
            boolean found = false;
            for(int k = 0; k < numbers.length; k++){
                if(numbers[k] == j){
                    found = true;
                    break;
                }
            }
            if(!found){
                missingNumbers.add(j);
                System.out.println("Missing number: " + j);
            }
        }

        return missingNumbers;
    }
}