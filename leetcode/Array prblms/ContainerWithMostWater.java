public class ContainerWithMostWater {
    public  void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        
    }
    public int maxArea(int[] height) {
        int max_water=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            max_water=Math.max(max_water,(min*(right-left)));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max_water;
        
    }
    
}