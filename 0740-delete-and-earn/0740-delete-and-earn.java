class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        
        
         for (int num : nums) {
           max = Math.max(num,max);
            
        }
        int[] count = new int[max+1];

        for(int num : nums){
            count[num] += num;
        }
        
        for(int i=2; i<count.length; i++) {
            count[i] = Math.max(count[i-2] + count[i], count[i-1]);
        }
        return count[count.length-1];
    }
}
