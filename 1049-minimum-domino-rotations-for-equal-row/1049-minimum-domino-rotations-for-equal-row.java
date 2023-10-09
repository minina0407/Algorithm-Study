class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
   HashMap<Integer, Integer> countMap = new HashMap<>();
      for (int i = 0; i < tops.length; i++) {
            countMap.put(tops[i], countMap.getOrDefault(tops[i], 0) + 1);
            countMap.put(bottoms[i], countMap.getOrDefault(bottoms[i], 0) + 1);
        }
    
        for(int num : countMap.keySet()){
            if(countMap.get(num)>=tops.length){
                int tCnt = 0;
                int bCnt = 0;
                int same = 0;
                for(int i = 0 ; i< tops.length ;i++){
                    if(tops[i]==num){
                        tCnt++;
                    }
                    if(bottoms[i]==num){
                        bCnt ++;
                    }
                    if( ( tops[i]==bottoms[i] ) && (countMap.get(num)>=tops.length) )  
                     {
                         same++;
                    }
                }
              if(tCnt + bCnt - same < tops.length ) return -1;
              
             return tops.length- Math.max(tCnt, bCnt); 
            }
        }
       return -1;
      }
}
     

