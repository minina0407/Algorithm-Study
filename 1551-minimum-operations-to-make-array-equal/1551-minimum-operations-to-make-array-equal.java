class Solution {
    public int minOperations(int n) {
    int cnt = 0;
    if(n%2 == 0 ){
        cnt = (n / 2) * (n / 2);
    }
    else{
        cnt =((n - 1) / 2) * ((n + 1) / 2);
    }
    return cnt;
   //      
    }
}