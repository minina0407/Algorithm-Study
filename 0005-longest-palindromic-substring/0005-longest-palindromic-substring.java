class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = expandFromCenter(s, i, i);
            int even = expandFromCenter(s, i, i + 1);
            int maxLen = Math.max(odd,even);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2; // mid부터 왼쪽으로 
                end = i + maxLen / 2; // mid부터오른쪽으로  
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
