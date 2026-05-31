import java.util.HashMap;

public class ValidAnagram {
    
    //01. this approach is using by array of letters [ 26 ]
    public static boolean isValidAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int letters[] = new int[26];

        for(int i=0; i<s.length(); i++){
            letters[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            letters[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26;i++){
            if(letters[i] != 0){
                return false;
            }
        }
        return true;

    }

    //02. using HashMap
    public static boolean isValidAnagram02(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c)-1);

            if(map.get(c) < 0){
                return false;
            }
        }
            return true;
     

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarm";

        System.out.println(isValidAnagram02(s,t));

    }
}
