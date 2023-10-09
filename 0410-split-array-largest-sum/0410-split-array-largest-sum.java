import java.util.Arrays;

class Solution {
    public int splitArray(int[] nums, int k) {
        long left = Arrays.stream(nums).max().getAsInt(); 
        long right = Arrays.stream(nums).sum(); 
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            
            int count = 1;
            long currentSum = 0;
            
            for (int num : nums) {
                currentSum += num;
                if (currentSum > mid) {
                    currentSum = num;
                    count++;
                }
            }
            
            if (count <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return (int) left;
    }
}
