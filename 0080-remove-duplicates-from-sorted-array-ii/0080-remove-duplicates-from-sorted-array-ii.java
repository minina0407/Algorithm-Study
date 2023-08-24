import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int k = 0;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            //  등장 횟수가 2 이하인 경우 배열에 추가
            if (counts.get(num) <= 2) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}
