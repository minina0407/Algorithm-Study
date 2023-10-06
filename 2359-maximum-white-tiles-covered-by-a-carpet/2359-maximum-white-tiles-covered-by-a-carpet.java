import java.util.Arrays;

class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, Comparator.comparingInt(i -> i[0]));
        int right = 0;
        int n = tiles.length;
        int ans = 0;
        int currTotal = 0;

        for (int i = 0; i < n; i++) {
            int start = tiles[i][0];
            int end = start + carpetLen - 1;

            while (right < n && tiles[right][1] < end) {
                currTotal += tiles[right][1] - tiles[right][0] + 1;
                right++;
            }

            if (right == n || tiles[right][0] > end) {
                ans = Math.max(ans, currTotal);
            } else {
                ans = Math.max(ans, currTotal + end - tiles[right][0] + 1);
            }

            currTotal -= tiles[i][1] - tiles[i][0] + 1;
        }

        return ans;
    }
}
