class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            list.add(i);
        }
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
           int num = nums[i];
           list.remove(Integer.valueOf(num));
        }
        if(list.size()==1){
            for(int i = 0 ; i<n ; i++){
            return list.get(i);
            }
        }
        return -1;
    }
}
