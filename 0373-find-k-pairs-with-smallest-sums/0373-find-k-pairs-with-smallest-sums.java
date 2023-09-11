import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return result;
        }
        
        // 우선순위 큐 ( 오름차순 )
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> a[0] + a[1] - b[0] - b[1]
        );
        
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }
        
        while(k-- > 0 && !minHeap.isEmpty()) {
            int[] cur = minHeap.poll();
            result.add(List.of(cur[0], cur[1]));
            
            if(cur[2] == nums2.length - 1) continue;
            
            minHeap.offer(new int[]{cur[0], nums2[cur[2]+1], cur[2]+1});
        }
        
        return result;
    }
}
