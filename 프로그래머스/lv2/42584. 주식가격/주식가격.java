class Solution {
    //초 단위로 기록된 주식가격이 담긴 배열 -> prices 
    // 가격이 떨어지지 않은 기간은 몇초인지를 return
    // 1 |  2  3 2   3 -> 4초동안 가격이 떨어지지않음 
    // 2 | 3 2 3 -> 3초동안 가격이 떨어지지 않음
    // 3 | 2 3 -> 가격이 한번 떨어짐 , 1초 동안 가격이 떨어지지 않음
    // 4 | 3 -> 가격이 떨어짐 , 0초 동안 가격이 떨어지지 않음
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        // 이중 반복문 사용
        for(int i=0; i<prices.length; i++){
            for(int j= i +1; j<prices.length; j++){
                answer[i]++;
                  if(  prices[i]>prices[j] ) 
                    break;
            }
        }
        
        return answer;
    }
}