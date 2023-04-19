import java.util.*;
class Solution {
    /*
    두 개의 문자열과 p가 주어지면 p의 아나그램의 모든 시작 인덱스 배열을 s로 반환합니다. 
    답변은 어떤 순서로든 반환할 수 있습니다.
    Anagram은 일반적으로 모든 원래 문자를 정확히 한 번 사용하여 다른 단어나 구의 문자를 재정렬하여 형성된 단어나 구입니다.
    */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        
        if (s.length() < p.length()) {
            return list;
        }
        
        int[] sChar = new int[26];
        int[] pChar = new int[26];
        
        for (int i = 0; i < p.length(); i++) {
            pChar[p.charAt(i) - 'a'] += 1;
        }
        
        int si = 0;
        
        for (int i = 0; i < s.length(); i++) {
            sChar[s.charAt(i) - 'a'] += 1;
            if (i - si + 1 == p.length()) {
                if (checkAnagram(sChar, pChar)) {
                    list.add(si);
                }
                sChar[s.charAt(si) - 'a'] -= 1;
                si++;
            }
        }
        return list;
    }
    public boolean checkAnagram(int[] sChar, int[] pChar) {
        for (int i = 0; i < 26; i++) {
            if (sChar[i] != pChar[i]) {
                return false;
            }
        }
        return true;
    }
}