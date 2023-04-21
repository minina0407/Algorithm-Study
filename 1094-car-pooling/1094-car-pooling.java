class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] num = new int[trips.length];
        int[] from = new int[trips.length];
        int[] to = new int[trips.length];
        int[] diff = new int[1001];
        
        for (int i = 0; i < trips.length; i++) {
            num[i] = trips[i][0];
            from[i] = trips[i][1];
            to[i] = trips[i][2];
            
            diff[from[i]] += num[i];
            diff[to[i]] -= num[i];
        }
        
        int passengerCount = 0;
        for (int i = 0; i < diff.length; i++) {
            passengerCount += diff[i];
            if (passengerCount > capacity) {
                return false;
            }
        }
        
        return true;
    }
}
