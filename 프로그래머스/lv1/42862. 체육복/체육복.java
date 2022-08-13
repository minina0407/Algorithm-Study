import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 구하고자 하는 거 : 학생의 최댓값
        // lost : 체육복을 도난당한 학생들
        // reverse : 여벌의 체육복을 가져온 학생들
        int answer = 0; // 학생의 최대값
        int count = 0; //빌린 학생 수
        Arrays.sort(lost);
        Arrays.sort(reserve);
        //여벌 옷을 가지고 있는 학생이 도난 당한 경우 -> 빌려줄 수 없음
        for(int i=0; i<lost.length; i++){
            // 도난 당한 학생들 중 여벌 옷 갖고 있는 학생이 도난 당한 경우 
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){ //도난 당한 학생 == 여벌옷 가져온 학생
                    lost[i] = reserve[j] = -1; //-1로 초기화 -> 빌려줄 수 없도록 설정 
                    count++; // 빌린 학생 수 증가 
                    break;
                }
            }
        }
        
        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
        for(int k : lost){
            for(int j=0; j<reserve.length; j++){
                if(k == reserve[j]-1 || k == reserve[j]+1){
                    //여벌 옷을 가져온 사람의 뒷사람과 앞사람 중  도난 당한 사람이 있다면 빌려줌
                    reserve[j] = -1;
                    // 여벌옷 가져온 사람은 -1
                    count++;
                    // 체육복 빌린 학생 증가 
                    break;
                }
            }
        }
        
        //결과값 : 전체 학생수 - 잃어버린 학생 수 + 빌린 학생 수
        answer = n - lost.length + count;
        return answer;
    }
}