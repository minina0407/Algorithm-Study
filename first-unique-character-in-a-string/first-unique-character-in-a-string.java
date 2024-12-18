class Solution {
    // 문자열 s가 주어졌을 때, s에서 처음으로 반복되지 않는 문자를 찾아
    //그 인덱스를 반환하세요. 만약 그러한 문자가 없다면, -1을 반환하세요.
    
    public int firstUniqChar(String s) {
        // 문자열 s
        // 반복되지 않는 문자의 인덱스를 return
        
        // 문자열 순회 (for)
        // leetcode -> 0 
        // loveleetcode -> 2
        
        // 그러면 해당되는 인덱스의 조건은
        // 문자열에서 등장하는 횟수가 1번이여야함
        // 근데 처음이라는 조건이 붙었으니깐
        // 만약에 등장횟수가 동일하게 1번인게 있다면
        // 제일 앞에있는 인덱스로 리턴
        // 예외 처리 : 등장 횟수가 1보다 크면 -1 return
        
        // 그럼 (문자 인덱스 , 등장횟수 ) 이렇게 저장하는 map 생성
        // HashMap 활용
        
        HashMap <Character , Integer>map = new HashMap<>();
        
         for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); // getOrDefault로 초기 값 0 처리
        }
        
        
        for(int i = 0 ; i < s.length() ; i ++){
            if(map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    
}
}