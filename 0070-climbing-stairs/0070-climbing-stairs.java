class Solution {
    public int climbStairs(int n) {
        // DP 문제 -> 여러개의 작은 문제로 쪼개기
        // 1,2 계단만 오를 수 있다.
        // 그러면 1이나 2 제외하고 나머지 숫자들이 오면
        // 그 숫자를 1이나 2로 쪼개기
        if(n==1 || n==2){
            return n;
        }  
        int arr[] = new int[n];
        arr[0] = 1 ;
        arr[1] = 2;
        for(int i = 2 ;i<n;i++){
        arr[i] = arr[i-1] + arr[i-2];    
        }
        return arr[n-1];
    }
}