class Solution {
    public int findJudge(int n, int[][] trust) {
         HashMap<Integer, Integer> trusts = new HashMap<>(); // 각 사람이 몇 명을 믿고 있는지 카운트할 HashMap
        HashMap<Integer, Integer> trusted = new HashMap<>(); // 각 사람이 얼마나 믿음을 받고 있는지 카운트할 HashMap
        
        
        for(int i = 1; i <= n; i++) {
            trusts.put(i, 0); // 모든 사람의 trust 카운트를 0으로 초기화
            trusted.put(i, 0); // 모든 사람의 trusted 카운트를 0으로 초기화
        }
        for(int i = 0 ; i<trust.length;i++){
            int key = trust[i][0];
            int trustedKey = trust[i][1];
            trusts.put(key,trusts.get(key)+1);
            trusted.put(trustedKey,trusted.get(trustedKey)+1);
        }
         for(int i = 1; i <= n; i++){
             if(trusts.get(i)==0 && trusted.get(i)==n-1){ // 마을 사람들이 모두 믿고있고, 마을판사는 아무도 안 믿어야해
                 return i;
             }
         }
        return -1;
    }
}