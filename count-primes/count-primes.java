class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; // n이 2 이하일 경우 소수 없음

        boolean[] isPrime = new boolean[n];
        // 초기화: 모든 숫자를 소수로 가정
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 적용
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // 배수는 소수가 아님
                }
            }
        }

        // 소수 개수 세기
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
