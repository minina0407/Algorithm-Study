class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] primes = new boolean[n];
        // 배열 요소들을 모두 true로 초기화 
        Arrays.fill(primes, true);
        // 0과 1은 소수가 아님
        primes[0] = false;
        primes[1] = false;
        
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    //i가 j의 배수일떄, j는 소수가 아니기때문에 primes[j] = false
                    primes[j] = false; 
                }
            }
        }
        int numPrimes = 0;
        for (boolean prime : primes) {
            // true인 것들만 모아서 numPrimes return 
            if (prime) {
                numPrimes++;
            }
        }
        
        return numPrimes;
    }
}
