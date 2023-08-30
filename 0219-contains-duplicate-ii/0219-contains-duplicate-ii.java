class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            // 해당 숫자가 이미 한 번 이상 등장했고 그 차이가 k 이하라면 true 반환
            if(countMap.get(num) > 1 && Math.abs(i - indexMap.get(num)) <= k){
                return true;
            }
            indexMap.put(num,i);
        }

        return false;
    }
}
