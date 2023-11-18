class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
    for(int i = 0 ; i<queries.length ; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int temp = 0;
             for(int j = 0 ; j<arr.length ; j++){
               if(j>=left && j<=right){
                    temp = temp ^ arr[j];
                }
            }
            result[i] = temp;
        }
        return result;
    }
}