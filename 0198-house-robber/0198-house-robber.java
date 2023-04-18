class Solution {
    public int rob(int[] nums) {
    int []arr = new int[nums.length + 3];
        for (int i = 3; i < nums.length + 3; i++)
        {
            arr[i] = Math.max(arr[i - 2], arr[i - 3]) + nums[i - 3];
        }
        return Math.max(arr[arr.length - 1], arr[arr.length - 2]);
} 
}