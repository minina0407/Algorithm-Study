class Solution {
    public int solution(int n) {
        //1->1, 2->2, 3->3 , 4->5 , 5->8, 6->13
        if(n == 1 || n==2) return n;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i <= n; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000007;
        }
        int answer =  arr[n];
        return answer;
    }
}