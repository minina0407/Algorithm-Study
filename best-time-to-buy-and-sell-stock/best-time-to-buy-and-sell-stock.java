class Solution {
    public int maxProfit(int[] prices) {
      if (prices == null || prices.length == 0) {
        return 0;
    }
    
    int min = prices[0];
    int max= 0;
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
        if ( prices[i] < min) {
            // 최솟 값 찾기
            min = prices[i];
        } else {
            profit  = prices[i] - min;
            if ( profit > max) {
                //profit의 최댓값 찾기
                max = profit;
            }
        }
    }
    
    return max;
}
}