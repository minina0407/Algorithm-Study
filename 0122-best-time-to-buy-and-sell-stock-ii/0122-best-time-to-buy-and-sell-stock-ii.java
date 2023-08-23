class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int sum = 0;
        
        for (int i = 0; i < prices.length - 1; i++) { 
            if (prices[i] < prices[i+1]) { // 현재 가격이 다음날 가격보다 작으면
                sum += prices[i+1] - prices[i]; // 그 차이를 sum에 더함
            }
        }
        
        return sum; 
    }
}
