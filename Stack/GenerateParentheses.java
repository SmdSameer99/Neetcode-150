package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public static List<String> GetGenerateParentheses(int k, int count, StringBuffer build){
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, k);
        System.out.println(res.toString());
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder sb, int open, int close, int max){
        if(sb.length() == max*2){
            res.add(sb.toString());
            return;
        }

        if(open < max){
            backtrack(res, sb.append('('), open + 1, close, max);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            backtrack(res, sb.append(')'), open , close + 1, max);
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Deque<Character> stack = new ArrayDeque<>();
        int n = 5;
        
        GetGenerateParentheses(n,0, null);
    }
}
