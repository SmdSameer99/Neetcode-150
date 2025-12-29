import java.util.ArrayList;
import java.util.List;

public class CountComputerUnlocking {
    
    public static void checkUnlock(int[] comp){

        int n = comp.length;
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> ComList = new ArrayList<>();
        
        backtracking(comp, 0, ComList, results);
        System.out.println(results.toString());
    }

    private static void backtracking(int[] comp, int index, List<Integer> currentSubset, List<List<Integer>> results) {
        if(currentSubset.size() == comp.length){
        results.add(new ArrayList<>(currentSubset));
        }

        for(int i = index; i< comp.length;i++){
            currentSubset.add(comp[i]);

            backtracking(comp, index+1, currentSubset, results);

            currentSubset.remove(currentSubset.size()-1);
        }
    }

    public static void main(String[] args) {
        int [] comp = {1, 2, 3};

        checkUnlock(comp);
    }
}
