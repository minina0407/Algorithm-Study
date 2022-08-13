import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int select = commands[i][2];
            int[] newarray = new int[end-start+1];
            int idx=0;
            for(int j = start-1;j<end;j++){
                newarray[idx]  = array[j];
                idx++;
            }
            Arrays.sort(newarray);
            answer[i] = newarray[select-1];
        }
        return answer;
    }
}