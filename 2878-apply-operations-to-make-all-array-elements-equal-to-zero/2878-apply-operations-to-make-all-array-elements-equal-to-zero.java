class Solution {
 public boolean checkArray(int[] nums, int k) {
    int cur = 0; // 현재 subarray의 합
    
    for (int i = 0; i < nums.length; i++) {
        if (cur > nums[i])
            return false; // 현재 subarray의 합이 현재 요소보다 크면 false 반환
        
        nums[i] -= cur; // 현재 요소에서 cur 값을 빼서 현재 subarray의 첫 번째 요소를 0으로 만듦
        cur += nums[i]; // cur에 현재 요소 값을 더하여 현재 subarray의 합 업데이트
        
        if (i >= k - 1)
            cur -= nums[i - k + 1]; // 현재 subarray의 크기가 k일 때, subarray의 첫 번째 요소를 제거
    }
    
    return cur == 0; // 모든 요소를 처리한 후, cur 값이 0이면 true 반환
}

}