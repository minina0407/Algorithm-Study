class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";

        // 각 문자를 중심으로 확장하는 방식으로 가장 긴 팰린드롬을 찾습니다.
        for (int i = 0; i < s.length(); i++) {
            // 홀수 길이 팰린드롬을 위해 중앙을 기준으로 확장
            String palindromeOdd = expandAroundCenter(s, i, i);
                   System.out.println(i);
            // 짝수 길이 팰린드롬을 위해 중앙과 그 다음 문자를 기준으로 확장합
            String palindromeEven = expandAroundCenter(s, i, i + 1);

            // 현재 찾은 팰린드롬이 기존의 가장 긴 팰린드롬보다 길다면 업데이트
            if (palindromeOdd.length() > longestPalindrome.length()) {
                longestPalindrome = palindromeOdd;
            }

            if (palindromeEven.length() > longestPalindrome.length()) {
                longestPalindrome = palindromeEven;
            }
        }

        return longestPalindrome;
    }

    // 주어진 문자열에서 중앙을 기준으로 팰린드롬을 확장하는 함수입니다.
    private String expandAroundCenter(String s, int left, int right) {
        // 왼쪽과 오른쪽 인덱스가 문자열 범위 내에 있고, 문자가 일치하는 동안 반복
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
       
            // 범위 벗어날때까지 양쪽으로 확장
            left--;
            right++;
          
        }

        // 팰린드롬의 범위 내에 있는 문자열을 반환
        // 팰린드롬의 범위는 (left + 1)부터 right까지입니다.
        return s.substring(left + 1, right);
    }
}
