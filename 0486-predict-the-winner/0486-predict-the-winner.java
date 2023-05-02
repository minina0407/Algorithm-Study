class Solution {
    public boolean PredictTheWinner(int[] nums) {
           return canPlayer1Win(nums, 0, 0, true);
    }
    
private boolean canPlayer1Win(int[] nums, int score1, int score2, boolean isPlayer1Turn) {
    if (nums.length == 0) {
        return score1 >= score2;
    }
    if (isPlayer1Turn) {
        return canPlayer1Win(Arrays.copyOfRange(nums, 1, nums.length), score1 + nums[0], score2, false)
                || canPlayer1Win(Arrays.copyOfRange(nums, 0, nums.length - 1), score1 + nums[nums.length - 1], score2, false);
    } else {
        return canPlayer1Win(Arrays.copyOfRange(nums, 1, nums.length), score1, score2 + nums[0], true)
                && canPlayer1Win(Arrays.copyOfRange(nums, 0, nums.length - 1), score1, score2 + nums[nums.length - 1], true);
    }
}
}