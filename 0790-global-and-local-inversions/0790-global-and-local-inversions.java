class Solution {
    public boolean isIdealPermutation(int[] nums) {
        // 지역 : nums[i]가 i , i+1 중 하나와 같거나 작을떄
        // 글로벌 : nums[i] 가 i + 2 ----- n-1 중 하나와 크다면
        // 즉 i 이후 인덱스보다 큰 인덱스에서 nums[i]가 더 큰값이 있을
       int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (Math.abs(nums[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }
}