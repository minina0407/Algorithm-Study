class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")) // s가 1이 될때까지
        {
            answer[0]++;  // 이진변환 횟수 
            String str = s.replaceAll("0" , ""); // 0을 공백으로 치환
            answer[1] += s.length() - str.length();
            //answer[1]은 0의 갯수
            // 제거된 0의 갯수 = 
            // s의 기존 문자열의 길이 - s의 문자열에서 0을 제거한 후의 길이
            s= Integer.toBinaryString(str.length()).toString();
            // str의 길이를 이진수로 바꾼후 다시 string으로 변환
        }
        return answer;
    }
    //x의 모든 0을 제거한다. ->그럼 0을 공백으로 replace
    // x의 길이를 c, x를 c를 2진법으로 표현한 문자열로 바꾼다.
    // s가 1이 될때까지 계속해서 s에 이진변환을 가했을 때, -> 반복문
    // 이진 변환의 횟수와, 변환 과정에서 제거된 모든 0의 개수를 배열에 담아 return -> 배열
    
}