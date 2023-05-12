class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Queue<int[]> days7 = new LinkedList<>();
        Queue<int[]> days30 = new LinkedList<>();
        int cost = 0;

        for (int d : days) {
            while (!days7.isEmpty() && days7.peek()[0] + 7 <= d) {
                days7.poll();
            }
            while (!days30.isEmpty() && days30.peek()[0] + 30 <= d) {
                days30.poll();
            }
            days7.offer(new int[]{d, cost + costs[1]});
            days30.offer(new int[]{d, cost + costs[2]});
            cost = Math.min(cost + costs[0], Math.min(days7.peek()[1], days30.peek()[1]));
        }

        return cost;
    }
}