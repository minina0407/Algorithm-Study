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
    //왜 indices 선언 ?
        // indices 선언한 이유는
        // points 배열의 인덱스를 저장하기 위해서

        Integer[] indices = new Integer[points.length];
        for (int i = 0; i < points.length; i++) {
            indices[i] = i;
        }
        // 인덱스 배열을 dis가 작은 순서대로 오름차순 정렬
        Arrays.sort(indices, (a, b) -> Double.compare(dis[a], dis[b]));

        // Create answer array with the first k points
        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            //왜 dis 배열에서 꺼내오지 않고, indices배열에서 꺼내와?
            // indices 배열에서 꺼내오는 이유는
            // indices 배열에는 points 배열의 인덱스가 저장되어 있기 때문에
            // indices 배열에서 꺼내오면 points 배열의 인덱스를 알 수 있다.
            answer[i][0] = points[indices[i]][0];
            answer[i][1] = points[indices[i]][1];
        }

        return answer;
    }
}