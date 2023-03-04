class Solution {
    //격자 카펫, return : 카펫의 가로 세로 크기
    // 매개변수 ; brown, yellow 
    //if brown -> 10개, yellow -> 2 : 4,3
    // if b-> 8, yellow -> 2 -> 3,3
    // 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 길다.
    // b>=y
    // b-> 8,10,12,14,16,18,20,22,24 ...
    // y ->1,2,3,4,5,6,7,8,9 ...
    // (3,3)(4,3)(5,3),(6.3)
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int x=1;x<=total;x++) {
            if(total % x != 0) 
                continue; // x로 나누어 떨어지지 않으면 조합이 될 수 없음
            int y = total / x;
            if(x < y) 
                continue; // 가로 길이가 세로 길이보다 작으면 조합이 될 수 없음
            int brownCount = 2 * (x + y) - 4; // 테두리 갈색 격자의 개수
            int yellowCount = total - brownCount; // 노란색 격자의 개수
            
            if(yellowCount == yellow && brownCount == brown) { // 주어진 조건과 일치하면 정답
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }
        return answer;
    }

}