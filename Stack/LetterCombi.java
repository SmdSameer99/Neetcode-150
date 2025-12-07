package Stack;

import java.util.List;
import java.util.ArrayList;

public class LetterCombi {
    
    public static List<String> getCombiNumber(String no){
        List<String> ans = new ArrayList<String>();
        backtracking(new StringBuilder(), ans, no, 0);
        System.out.println(ans.toString());
        return ans;
    }

    private static void backtracking(StringBuilder sb, List<String> ans, String no, int index){
        if(index == no.length()){
            ans.add(sb.toString());
            return;
        }
        
        int digit = Character.getNumericValue(no.charAt(index));
        backtracking(sb.append((char)('a'+(digit%10)-1)), ans, no, index+1);
        sb.deleteCharAt(sb.length()-1);
        backtracking(sb.append((char)('b'+(digit%10)-1)), ans, no, index+1);
        sb.deleteCharAt(sb.length()-1);
        backtracking(sb.append((char)('c'+(digit%10)-1)), ans, no, index+1);
        sb.deleteCharAt(sb.length()-1);
    }

    public static void main(String[] args) {
        String digits = "12" ;
        getCombiNumber(digits);

    }
}
