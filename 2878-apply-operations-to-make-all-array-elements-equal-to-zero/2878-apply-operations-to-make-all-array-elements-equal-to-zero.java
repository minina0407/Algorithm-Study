class Solution {
    public boolean checkArray(int[] nums, int k) {
        int cur = 0 ; // 현재 subarray의 합
        
        for(int i = 0 ; i <nums.length ;i++){
            if(cur > nums[i])
                 return false;
            // k크기의 subarray 찾기
            nums[i] -=cur;
            cur+=nums[i];
            if(i >= k-1) // 현재 subarray의 크기가 k일때
            cur-=nums[i-k+1]; // subarray의 첫번째 요소를 제거
        }
        return cur ==0;
    }
}