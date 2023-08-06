import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 내림차순 정렬
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
              new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        // k 크기 만큼 빈도수높은아이들 배열 return 
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            answer[i] = entry.getKey();
        }
        return answer;
    }
}
