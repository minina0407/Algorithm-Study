class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
      
        if (nums.length == 1) 
            return 0;
        if (nums[right] > nums[right - 1]) 
            return right;
      
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[0] > nums[1]) 
                return 0;

            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) 
                return mid;
            
            if(nums[mid]<nums[mid+1])
                left = mid + 1;
                
            else 
                right = mid; 
        }     
       return left; 
    }
}
