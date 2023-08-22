import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
     // 빈도수 높은 element 반환
     // HashMap 사용해서 integer, 빈도수 저장
     // 빈도수가장높은 key 출력
     int answer =  0 ;
     HashMap<Integer, Integer> numsMap = new HashMap<Integer,Integer>();
     for(int num : nums){
        numsMap.put(num, numsMap.getOrDefault(num,0)+1);
     }
   
     Optional<Map.Entry<Integer, Integer>> maxEntry =numsMap.entrySet().stream().max(Map.Entry.comparingByValue());
    return  maxEntry.get().getKey();
}
}