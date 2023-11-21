class Solution {
    public int[][] kClosest(int[][] points, int k) {
           int[] x =new int[points.length];
        int[] y =new int[points.length];
        double[] dis = new double[points.length];
        for(int i = 0  ; i <  points.length ; i++) {
              x[i] = points[i][0];
             y[i] = points[i][1];
        }

        for(int i = 0  ; i <  points.length ; i++) {
           dis[i] = Math.sqrt( Math.pow(x[i],2) + Math.pow(y[i],2));
        }

            Integer[] indices = new Integer[points.length];
        for (int i = 0; i < points.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Double.compare(dis[a], dis[b]));

        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i][0] = points[indices[i]][0];
            answer[i][1] = points[indices[i]][1];
        }

        return answer;
    }
}