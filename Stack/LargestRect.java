package Stack;

import java.util.Stack;

public class LargestRect {

    public static void getMaxArea(int[] hight){
        int n = hight.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && hight[i] <= hight[stack.peek()] ) {
                int h = hight[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() -1;
                int area = h * width;
                maxArea = Math.max(maxArea, area);
            }stack.push(i);
        }

        while (!stack.isEmpty()) {
            int h = hight[stack.pop()];
            int width = stack.isEmpty() ? n : n -stack.peek() - 1;
            int area = h * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);
        // return maxArea;
    }

    public static void main(String[] args) {
        int hight[] = {2,4};
        getMaxArea(hight);
    }
    
}
