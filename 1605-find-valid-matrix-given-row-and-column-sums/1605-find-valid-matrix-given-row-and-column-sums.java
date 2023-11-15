class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {

     int[][] answer = new int[rowSum.length][colSum.length];
     for(int i = 0 ; i <colSum.length ; i++){
         for(int j = 0 ; j< rowSum.length ; j++ ){
            int val = Math.min(rowSum[j],colSum[i]);
            rowSum[j] -= val;
            colSum[i] -=val;
            answer[j][i] = val;
         }

     }
     return answer;
    }
}