import java.util.List;

public class GroupAnagram {
    
    public List<List<String>> GroupAnagram(String[] strs) {
        int count = 0;
        for (String string : strs) {
            System.out.println(string);
            for(int i=0;i<string.length();i++){count++;}
            System.out.println(count);
            count=0;
        }
        return null;
    }


    public static void main(String[] args) {
        GroupAnagram obj = new GroupAnagram();
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = obj.GroupAnagram(strs);
        System.out.println(ans);
    }
}
