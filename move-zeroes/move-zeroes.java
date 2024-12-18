import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        //정수 배열 nums가 주어졌을 때, 
        //배열 내의 모든 0을 배열의 끝으로 이동시키되, 0이 아닌 요소들의 상대적인 순서는 유지하세요.

        //단, 배열을 복사하지 않고 제자리에서(in-place) 작업을 수행해야 합니다.
        
        // 0은 모조리 배열의 끝으로 이동
        // 그외의 숫자는 오름차순 정렬
        
        // 그럼 먼저 0이 아닌 요소들에 대해서 정렬
        // 그리고 남은 자리는 0으로 채우기
        
        int idx = 0 ; 
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0 ){
                nums[idx] = nums[i];
                idx++;
            }
        }
      
        
         while (idx < nums.length) {
            nums[idx] = 0;
            idx++;
        }
    }
}