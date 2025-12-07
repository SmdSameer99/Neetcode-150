package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DailyTemp {
    
    public static int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // Stores indices
        
        for (int i = 0; i < n; i++) {
            // Pop until current temp <= stack top temp
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex; // Days waited
                System.out.println("prevIndex "+prevIndex);
            }
            stack.push(i); // Always push current index
        }
        for (Integer x : res) {
            System.out.println(x);            
        }
        return res; // Unfilled = 0 (default)
    
    }

    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        dailyTemperatures(temp);

    }
}
