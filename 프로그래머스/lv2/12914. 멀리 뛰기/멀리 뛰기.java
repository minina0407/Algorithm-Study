class Solution {
    public long solution(int n) {
        // 멀리뛰기에 사용될 칸의 수  n이 주어질때, 효진이가 끝에 도달하는 방법 가지수 출력 후 
        // 이를 1234567로 나눈 나머지 리턴 
        int[] arr = new int[2001]; 
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3 ; i < 2001 ; i++){
         arr[i] = ( arr[i-2] + arr [i -1] ) % 1234567;
        }
        return arr[n];
    }
}