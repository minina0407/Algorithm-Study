class Solution {
    public int minimumRounds(int[] tasks) {
       Arrays.sort(tasks);

        // 같은 요소가 몇개 등장했는지 확인 위해 HashMap 선언
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<tasks.length ; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        int res = 0;
        for(int freq : map.values()){
            if(freq == 1) return -1;
            // freq가 3이면 5/3 = 1
            // freq가 4이면 6/3 = 2
            // freq가 5이면 7/3 = 2
            // freq가 6이면 8/3 = 2
            // 일반화 : (freq+2) / 3
            
            res+= (freq+2) / 3;
        }
        return res;
}
}