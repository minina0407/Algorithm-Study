class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        HashMap<Integer,Integer> numsCount = new HashMap<>();
        List<Integer> list = new ArrayList<>();

           
        int[] count  = new int[1001];
        
        for(int[] arr : nums){
            for(int i : arr){
                count[i]++;
            }
        }

        for(int i=0;i<count.length;i++){
           if(count[i]==nums.length){
               list.add(i);
           }
       }
        return list;
    }
}

