import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    
    public List<List<String>> groupAnagram(String[] strs) {
        int count = 0;
        for (String string : strs) {
            System.out.println(string);
            for(int i=0;i<string.length();i++){count++;}
            System.out.println(count);
            count=0;
        }
        return null;
    }

    public List<List<String>> groupAnagram02(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();

        for (String string : strs) {

            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if(map.containsKey(key)){
                map.get(key).add(string);
            }else{
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(key, list);
            }


            
        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        GroupAnagram obj = new GroupAnagram();
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = obj.groupAnagram02(strs);
        System.out.println(ans);
    }
}
