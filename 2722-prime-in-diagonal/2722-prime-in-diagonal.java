class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length; 
        List<Integer> diagonalElements = new ArrayList<>();
        int maxPrime = 0;

        // 대각선 요소들 nums[i]에 넣기
        for (int i = 0; i < n; i++) {
            diagonalElements.add(nums[i][i]);
        }

        for (int i = 0; i < n; i++) {
            if (i != n - i - 1) {
                diagonalElements.add(nums[i][n - i - 1]);
            }
        }

        
        boolean[] isPrime = new boolean[4 * 1000000 + 1];
        Arrays.fill(isPrime, true);

        
        for (int i = 2; i * i <=4 * 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 4 * 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }


        for (int i : diagonalElements) {
            if (i >= 2 && isPrime[i]) {
                maxPrime = Math.max(maxPrime, i);
            }
        }

        return maxPrime;
    }
}
