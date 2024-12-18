class Solution {
    // 정수 n이 주어졌을때, 이수가 3의 거듭제곱이면 true 반환
    // 그렇지 않으면, false 반환
    // n이 3의 거듭제곱이면, n == 3 ^ x를 만족하는 정수 x가 존재한다는 의미
    
    public boolean isPowerOfThree(int n) {
        // 만약 n이 3의 거듭제곱이라면
        // 그렇다면 3의 거듭제곱인지 어떻게 판별해야 할까?
        // 3 x 3 x 3 x ..... 
        // 그럼 n을 3으로 나눴을 때 0이여야돼 
        // 그럼 n을 3으로 나눴을 때 0이면 true 
        
        // 예외 처리 
        if( n <= 0 )  return false;

        // n이 1이 될때까지 div = 0 인지 확인 
        while(n > 1 ){
        
        if (n%3 != 0) 
        {
            return false;  
        }
            n/=3;
        }

        return true;
    }
}