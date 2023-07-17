class Solution {
    public String mergeAlternately(String word1, String word2) {
        /*
        word1과 word2 두 줄이 주어집니다. 
        단어 1부터 시작하여 교대로 문자를 추가하여 문자열을 병합합니다. 
        문자열이 다른 문자열보다 길면 병합된 문자열 끝에 추가 문자를 추가합니다.
        병합된 문자열을 반환합니다.
        */
        String s = "";
        int minLength = Math.min(word1.length() , word2.length());
        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; i<minLength ; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            for(int i = minLength ; i<word1.length(); i++){
            sb.append(word1.charAt(i));
            }
        }
        if(word1.length()<word2.length()){
            for(int i = minLength ; i<word2.length(); i++){
            sb.append(word2.charAt(i));
            }
        }
        s=sb.toString();
        return s;
    }
}