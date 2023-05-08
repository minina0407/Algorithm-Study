public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }
        if (n % 2 == 1) {
            sum -= mat[n/2][n/2];// 중복된 가운데 값 제외
        }
        return sum;
    }
}
