import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
 public  int findMin(int[] nums) { // nums : 로테이션된 배열
        Deque<Integer> dequeue = new ArrayDeque<>();
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}