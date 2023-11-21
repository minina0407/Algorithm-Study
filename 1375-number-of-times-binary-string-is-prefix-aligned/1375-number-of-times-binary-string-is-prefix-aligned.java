class Solution {
    public int numTimesAllBlue(int[] flips) {
        int cnt = 0;
        int maxIndex = 0;
        for (int i = 0; i < flips.length; i++) {
            maxIndex = Math.max(maxIndex, flips[i]);
            // 현재까지의 최대 인덱스가 i+1과 같다면 모든 비트가 1로 채워진 상태
            if (maxIndex == i + 1) {
                cnt++;
            }
        }
        return cnt;
    }
}