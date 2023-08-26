class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll(" ", "");
        str = str.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
        str = str.toLowerCase();
        
        if (str == null || str.length() < 1) {
            return true;
        }
        
        int left = 0;
        int right = str.length() - 1; 
        
        while (left <= right && str.charAt(left) == str.charAt(right)) { 
            left++;
            right--;
        }
        
        return left >= right;
    }
}
