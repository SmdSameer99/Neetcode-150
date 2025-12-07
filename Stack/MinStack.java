package Stack;

import java.util.Stack;

class MinStack {
    private Stack<Integer> minStackObj , stack;

    public MinStack() {
         minStackObj = new Stack<>();
         stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStackObj.isEmpty() || val <= minStackObj.peek()) {
            minStackObj.push(val);
        }
    }
    
    public void pop() {
        int temp = stack.pop();
        if(temp == minStackObj.peek()){
            minStackObj.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
         return minStackObj.peek();
    }
    public static void main(String[] args) {
        MinStack obj1 = new MinStack();
        obj1.push(3);
        obj1.push(2);
        obj1.push(1);
        obj1.top();
        System.out.println( obj1.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */