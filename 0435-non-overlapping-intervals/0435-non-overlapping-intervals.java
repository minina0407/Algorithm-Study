class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // 겹치치않기 위해 제거해야하는 최소 구간 
                Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
               int answer = 0 ;
               int lastEnd = Integer.MIN_VALUE;
               for(int i = 0 ; i <intervals.length; i++){
                   //현재 구간의 시작 시간이 이전 구간의 종료 시간보다 작으면 겹침
                   if(intervals[i][0]<lastEnd ){
                       answer++;
                   }
                else
                 lastEnd = intervals[i][1];

               }
               return answer;
               }

}