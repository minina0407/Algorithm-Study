class Solution {
    public int findCircleNum(int[][] isConnected) {
        int answer = 0;
        boolean[] check = new boolean[isConnected.length]; 
        for (int i = 0; i < isConnected.length; i++) {
        if (!check[i]) {
        checkConnected(isConnected, i, check);
        answer++;
        }
        }
        return answer;
        }

        boolean[] checkConnected(int[][] isConnected, int i, boolean[] check) {
        check[i] = true;

        for (int j = 0; j < isConnected.length; j++) {
        if (isConnected[i][j] == 1 && check[j] == false) {
        check = checkConnected(isConnected, j, check);
        }
        }
        return check;
        }
    
}