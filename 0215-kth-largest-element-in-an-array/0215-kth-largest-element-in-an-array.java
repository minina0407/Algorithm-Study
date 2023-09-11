import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0; 
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.offer(num);
        }
        
        while (k > 1) {
            maxHeap.poll(); // 큐에서 큰 요소를 제거하여 k-1번째로 큰 요소 찾기
            k--;
        }

        return maxHeap.poll(); // k번째로 큰 요소 반환
    }
}
