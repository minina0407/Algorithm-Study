class Solution {
    public String solution(String s, int n) {
        // 문자열 : s , 거리 : n 
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += c;
                continue;
            }
            if (c >= 'a' && c <= 'z')//소문자일 경우
            {
                if (c + n > 'z') {
                    answer += (char) (c - 26 + n);
                } else
                    answer += (char) (c + n);
            } else if (c >= 'A' && c <= 'Z') { //대문자일 경우
                if (c + n > 'Z') {
                    answer += (char) (c - 26 + n);
                } else
                    answer += (char) (c + n);
            }

        }


        return answer;
    }
}