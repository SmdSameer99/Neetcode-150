package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CarFleet {
    
    public static int main(String[] args) {
        int n = 2, target = 10;
        int position[] = {6, 8};
        int speed[] = {3, 2};
        // int time[] = new int[n];
       
        //sort by postion 1st will lead remaining 
        int[][] compairWithTime = new int[n][2];
        for(int i=0;i<n;i++){
            compairWithTime[i][0] = position[i];
            compairWithTime[i][1] = (target - position[i]) / speed[i];
        }

        Arrays.sort(compairWithTime, (a, b) -> Integer.compare(b[0], a[0]));
        
        Deque<Integer> stack = new ArrayDeque<>();
        for(int[] car : compairWithTime){
            int time = car[1];

            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }
       
        return stack.size();
    }

    // public static void main(String[] args) {
        
    // }
}
