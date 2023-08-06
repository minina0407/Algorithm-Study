class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i); // 홀수 길이 팰린드롬에 대한 개수 추가
            count += expand(s, i, i + 1); // 짝수 길이 팰린드롬에 대한 개수 추가
        }

        return count;
    }

    public int expand(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; // 팰린드롬 부분 문자열 발견시마다 카운트 증가
            left--;
            right++;
        }
        return count;
    }
}
