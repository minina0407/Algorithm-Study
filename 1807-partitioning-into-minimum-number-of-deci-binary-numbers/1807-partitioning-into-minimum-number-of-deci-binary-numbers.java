class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0; i <n.length() ; i++){
            char c = n.charAt(i);
            int digit = Character.getNumericValue(c);
       
            maxDigit = Math.max(maxDigit,digit);
        }
        return maxDigit;
    }
}