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
        int sizeOfNum1=  Math.min(nums1.length, k);

        for (int i = 0; i <sizeOfNum1; i++) {
            minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }
        
        while(k-- > 0 && !minHeap.isEmpty()) {
            int[] cur = minHeap.poll();
            result.add(List.of(cur[0], cur[1]));
            
            if(cur[2] == nums2.length - 1) continue;
            
            // 현재 쌍에서 nums1의 값과 인덱스는 그대로 유지하고, nums2의 인덱스만 1 증가시킨다.
           int nextNums2Index = cur[2] + 1;

            // 같은 nums1 값과 다음 nums2 값을 짝지어서 minHeap에 추가한다.
            minHeap.offer(new int[]{cur[0], nums2[nextNums2Index], nextNums2Index});
        }
        
        return result;
    }
}
