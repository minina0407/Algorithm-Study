class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0; 
        int sum = 0;
        int minLength = nums.length + 1;

        while (right < nums.length) {
            sum += nums[right];

            while (sum >= target) { 
                minLength = Math.min(minLength, right - left + 1); 
                sum -= nums[left]; 
                left++;
            }

            right++;
        }

        return minLength == nums.length + 1 ? 0 : minLength; 
    }
}
