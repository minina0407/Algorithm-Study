import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
     List<Integer> listOfNum=new ArrayList<>();
     for(int i = 0 ; i< nums.length ; i ++){
       if(!listOfNum.contains(nums[i])){
                listOfNum.add(nums[i]);
            }
    
     }
     for(int i = 0 ; i<listOfNum.size(); i++){
         nums[i]=listOfNum.get(i);
     }
     return listOfNum.size();
  
    }
}