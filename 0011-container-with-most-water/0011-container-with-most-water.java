class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length -1;
        int width = 0;
        int max = 0 ;
        
        while(left<right){
        width = right - left;   
        int h = Math.min(height[left], height[right]);
        int con = width * h;
        max = Math.max(max, con);
      
         if(height[left] < height[right]) left++;
         else if(height[left] > height[right]) right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}