class Solution {
    public boolean isUgly(int n) {
     if( n < 1) return false;
    // 2, 3, 5 로 나눠서 결과물이 1이 나온다면 -> 소수인거니깐 소수일 경우 true 리턴
    while(n%2 == 0 )  n /= 2;
    while(n%3 == 0 )  n /=3;
    while(n%5 == 0) n /=5;
        
   return n==1;
         
    }
}