import java.util.Arrays;

class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, (a, b) -> a[0] - b[0]);
        int right = 0;
        int n = tiles.length;
        int ans = 0;
        int currTotal = 0; // 흰타일갯수

        for (int i = 0; i < n; i++) {
            int start = tiles[i][0];
            int end = start + carpetLen - 1; // 카펫의 끝위치 

            while (right < n && tiles[right][1] < end) {
                // 현재 카펫으 ㅣ끝위치보다 다음 타일의 시작 위치가 오른쪽에 있는 경우 
                currTotal += tiles[right][1] - tiles[right][0] + 1;
                right++;
            }

            if (right == n || tiles[right][0] > end) {
                //다음 타일의 시작 위치가 현재 카페의 끝위치보다 오른쪽에 있는 경우 
                ans = Math.max(ans, currTotal);
            } else {
                ans = Math.max(ans, currTotal + end - tiles[right][0] + 1);
            }

            currTotal -= tiles[i][1] - tiles[i][0] + 1;
        }

        return ans;
    }
}