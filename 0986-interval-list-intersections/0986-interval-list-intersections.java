class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // 만약 첫번째 리스트나 두번째 리스트가 비어있으면, 빈 2차원 배열을 반환한다.
        if (firstList.length == 0 || secondList.length == 0) return new int[0][0];
        
        // start와 end는 겹치는 구간의 시작과 끝을 나타낸다.
        int start = 0;
        int end = 0;
        
        // i와 j는 firstList와 secondList의 인덱스를 나타낸다.
        int i = 0;
        int j = 0;
        
        // answer는 겹치는 구간을 저장하는 리스트다.
        List<int[]> answer = new ArrayList<>();
        
        // firstList와 secondList를 돌면서 겹치는 구간을 찾는다.
        while (i < firstList.length && j < secondList.length) {
            // start는 firstList[i][0]과 secondList[j][0] 중 큰 값이다.
            start = Math.max(firstList[i][0], secondList[j][0]);
            // end는 firstList[i][1]과 secondList[j][1] 중 작은 값이다.
            end = Math.min(firstList[i][1], secondList[j][1]);
            
            // 만약 end가 start보다 크다면, 겹치는 구간이 존재한다는 뜻이다.
            if (end >= start) {
                // 겹치는 구간을 answer에 추가한다.
                answer.add(new int[]{start, end});
            }
            
            // end가 firstList[i][1]와 같다면, firstList의 다음 구간으로 이동한다.
            if (end == firstList[i][1]) i++;
            // end가 secondList[j][1]와 같다면, secondList의 다음 구간으로 이동한다.
            if (end == secondList[j][1]) j++;
        }
        
        // answer를 2차원 배열로 변환하여 반환한다.
        return answer.toArray(new int[answer.size()][2]);
    }
}
