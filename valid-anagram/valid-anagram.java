class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        두 문자열과 t가 주어지면 s의 아나그램이면 true를 반환하고 그렇지 않으면 false를 반환합니다.

Anagram은 일반적으로 모든 원래 문자를 정확히 한 번 사용하여 다른 단어나 구의 문자를 재정렬하여 형성된 단어나 구입니다.
        */

        if(s.length()!=t.length()){
            return false; // 만약 s의 문자열 길이가 t보다 작으면, t의 아나그램의 부분 문자열을 포함 할 수 없으므로 false 리턴 
        }
        int[] sChar = new int[26]; // 문자열 s에 대한 문자 카운팅
        int[] tChar = new int[26];// 문자열 t에 대한 문자 카운팅
        
        for(int i = 0  ; i< t.length(); i++){ 
            // 문자열 t의 각 문자의 등장 횟수를 tChar 배열에 저장한다.
            // 각 문자를 int형 index로 변환해서 해당 인덱스의 값을 증가시킨다.
            // 왜 int형 index로 변환하나면 등장횟수를 count해서 저장해서
            // 나중에 
            tChar[t.charAt(i)-'a']+=1; 
            
        }
        // 시작 인덱스 
        int si = 0;
        for(int i = 0 ; i<s.length();i++){
          // 문자열 s의 각 문자의 등장 횟수를 sChar 배열에 저장한다.
        sChar[s.charAt(i)-'a']+=1;
            // 만약 현재 찾은 문자열의 길이 == t 문자열의 길이
            // -> t문자열과 길이가 같은 부분 문자열 찾았을 떄 
            //i는 현재 위치, si는 현재찾고있는 문자열의 시작 위치
            if(i-si+1== t.length()){
                if(checkAnagram(sChar,tChar)){
                   return true;
                }
                // 문자열 s의 시작 인덱스 변경을 위헤 => sChar에서 해당 문자 
                // 등장 횟수 1 감소시키고 시작 인덱스 1 증가
               // sChar[s.charAt(si)-'a']-=1;
              //  si++;
            }
        }
        return false;
    }
    public boolean checkAnagram(int[]sChar, int[] tChar){
        for(int i = 0 ; i < 26; i++){
        if(sChar[i]!=tChar[i]){
            return false;
        }
        }
        return true;
    }
}