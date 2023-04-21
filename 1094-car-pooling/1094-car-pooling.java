class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // 각각의 배열에는 각 여행의 인원 수, 출발 위치, 도착 위치를 저장
        int[] num = new int[trips.length];
        int[] from = new int[trips.length];
        int[] to = new int[trips.length];

        // diff[i]에는 시간 i에서 탑승한 승객 수와 하차한 승객 수의 차이를 저장합니다.
        // 예를 들어, diff[3]이 5이면, 시간 3에 5명이 탑승한 것입니다.
        int[] diff = new int[1001];

        // 각 여행의 정보를 배열에서 추출하여 num, from, to 배열에 저장합니다.
        for (int i = 0; i < trips.length; i++) {
            num[i] = trips[i][0];
            from[i] = trips[i][1];
            to[i] = trips[i][2];

            // from[i] 시간에 num[i]명이 승차
            diff[from[i]] += num[i];
            // to[i] 시간에 num[i]명이 하차
            diff[to[i]] -= num[i];
        }

        int passengerCount = 0;
        // 시간별 승객 수를 구하고, capacity를 초과하는 경우 false 반환
        for (int i = 0; i < diff.length; i++) {
            passengerCount += diff[i];
            if (passengerCount > capacity) {
                return false;
            }
        }

        // capacity를 초과하지 않은 경우 true 반환
        return true;
    }
}
