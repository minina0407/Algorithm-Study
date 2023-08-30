class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //magazine 의 문자열내에 ransomNote가 있다면 true
        // magazine에서 만들 수 있는 모든 부분 문자열검사
        // 그것보다는 magazine의 문자 등장횟수를 HashMap에 저장
        // HashMap에 저장된 counting 횟수랑 같다면 true
        // 적거나, 많다면 false 
     HashMap<Character,Integer> countMagMap = new HashMap<>();
       HashMap<Character,Integer> countRanMap = new HashMap<>();
      for(char c : magazine.toCharArray()){
       countMagMap.put(c, countMagMap.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()){
       countRanMap.put(c,  countRanMap.getOrDefault(c, 0) + 1);
        }
       for (char c : countRanMap.keySet()) {
        if (! countMagMap.containsKey(c) || countMagMap.get(c) < countRanMap.get(c)) {
        return false;
          }
}
        return true;
    }
}