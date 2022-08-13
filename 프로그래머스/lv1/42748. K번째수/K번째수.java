import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int select = commands[i][2];
            // 사이즈는 끝 - 시작  + 1
            int[] newarray = new int[end-start+1];
            int idx=0;
            for(int j = start-1;j<end;j++){
                // 배열에 담기 (배열은 0부터 시작이라 start-1 해줌 )
                newarray[idx]  = array[j];
                idx++;
            }
            // 정렬
            Arrays.sort(newarray);
            answer[i] = newarray[select-1];
        }
        return answer;
    }
}