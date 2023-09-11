import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0; 
        }
        
        // 우선순위 큐
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // 큐의 크기가 k를 초과하면 가장 작은 요소 제거
            }
        }

        return minHeap.poll(); // k번째로 큰 요소 반환
    }
}
