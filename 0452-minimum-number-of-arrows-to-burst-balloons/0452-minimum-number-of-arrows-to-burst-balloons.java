class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int shots = 0;
        long lastEnd =  Long.MIN_VALUE;

        for(int i = 0 ; i <points.length ; i++){
            if(points[i][0]> lastEnd ){
                shots++;
                lastEnd = points[i][1];
            }
        }
        return shots;
    }
}