import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0; //answer은 현재 내가 요청한 문서 몇번째로 인쇄되는지
        Queue<Integer> queue = new LinkedList<>();
        
        //priorities 값을 큐에 담음
        for(int n :  priorities)
        {  queue.add(n); }
        
        // priorities 배열을 오름차순으로 정렬 -> length는 MAX값
        Arrays.sort( priorities );
        int length =  priorities.length-1;
        
        //큐가 빌 때까지
        while(!queue.isEmpty()){
         int cur = queue.poll(); 
          if( cur == priorities[length-answer])  //만약에 제일 큰 값일경우
          {  answer++; //answer 증가
            location --; //location 감소 
            if(location <0){
                break;
            }
        }
        
        else  //만약 제일 큰 값이 아닐 경우 poll()해서 뺀 값을 큐 뒤에 add 후 location 감소
        {
            queue.add(cur);
            location --;
            if(location < 0 ){
                location = queue.size() -1;
            }
        }
        }
        return answer;
    }
}