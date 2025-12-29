public class ContainerMostWater {
    
    public static int checkMostWater(int[] height){
        int area = 0, maxArea = 0;
        int left = 0, right = height.length-1;

        while (left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        
        int []height = {1,8,6,2,5,4,8,3,7};

        int ans = checkMostWater(height);

        System.out.println(ans);
    }
}
