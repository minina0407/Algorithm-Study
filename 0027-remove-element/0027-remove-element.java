class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> listOfnum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            listOfnum.add(nums[i]);
        }
        for(int num : nums){
            if(num == val){
                listOfnum.remove(Integer.valueOf(num));
            }
        }
        for (int i = 0; i < listOfnum.size(); i++) {
            nums[i] = listOfnum.get(i);
        }
        return listOfnum.size();
    }
}