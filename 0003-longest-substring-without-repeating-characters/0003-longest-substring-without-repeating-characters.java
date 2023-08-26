import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0; 
        HashSet<Character> subStringSet = new HashSet<>();
        int maxLength = 0;

        while (right < s.length()) {
            if (subStringSet.contains(s.charAt(right))) { 
                subStringSet.remove(s.charAt(left));
                left++;
            } else {
                subStringSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
               
            }
        }

        return maxLength;
    }
}
