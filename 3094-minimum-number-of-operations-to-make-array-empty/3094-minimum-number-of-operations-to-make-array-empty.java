class Solution {
    public int minOperations(int[] nums) {
    Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        
        for (int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        
        int answer = 0;
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            
            if (count == 1) {
                return -1;
            }
            
           answer += Math.ceil(count / (3.0));
        }
        
        return answer;
        
    }
}