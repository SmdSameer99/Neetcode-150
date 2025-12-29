public class RainWaterTapping {
    
    public static int checkMaxTappingWatter(int[] height){
        int n = height.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        
        // Build lMax array (max height from left)
        lMax[0] = height[0];
        for(int i=1; i<n; i++){
            lMax[i] = Math.max(lMax[i-1], height[i]);
        }
        
        // Build rMax array (max height from right)
        rMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rMax[i] = Math.max(rMax[i+1], height[i]);
        }
        
        // Calculate trapped water
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(checkMaxTappingWatter(height));  // Output: 6
    }
}
