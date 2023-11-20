class Solution {
    //for문이 아닌 비트마스크 이용해서 
    // 문자열을 비교한 이유는 for문으로 하면 시간초과나기때문
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0 ; i< words.length ; i++){
            for (int j = i + 1; j < words.length; j++) {
                if( compareTwoWords(words[i], words[j]))
                {
                    max = Math.max(max, words[i].length() * words[j].length());

                }
            }
        }

        return max;
    }
    private boolean compareTwoWords(String word1, String word2){
        // 비트 마스크 이용해서 풀기
        // 1. word1, word2를 비트마스크로 변환
        // 2. word1 & word2 == 0 이면 true
        // 3. word1 & word2 != 0 이면 false
        int word1BitMask = 0;
        int word2BitMask = 0;
        for(int i = 0 ; i< word1.length() ; i++){
            // word1.charAt(i) - 'a' : word1의 i번째 문자를 숫자로 변환
            // 1 << (word1.charAt(i) - 'a') : word1의 i번째 문자를 숫자로 변환한 것을 1과 비트연산
            // << : 비트를 왼쪽으로 밀어준다.
            // 왜 1과 비트연산?
            // 1과 문자를 비트연산하는 이유는
            // 문자를 숫자로 변환한 것을 비트연산해서
            // 문자를 숫자로 변환한 것을 비트마스크로 만들기 위해서
            // | : 비트를 더해준다.
            // 즉 word1을 비트마스크로 만들어주는 것
            
             word1BitMask |= 1 << (word1.charAt(i) - 'a');
        }
        for(int i = 0 ; i< word2.length() ; i++){
            word2BitMask |= 1 << (word2.charAt(i) - 'a');
        }
        // word1BitMask & word2BitMask == 0 이면
        // word1BitMask와 word2BitMask가 겹치는게 없다는 뜻이다.
        // 즉 word1과 word2가 겹치는게 없다는 뜻이다.
        // 그래서 true를 리턴한다.
        if((word1BitMask & word2BitMask) == 0){
            return true;
        }
        // word1BitMask & word2BitMask != 0 이면
        // word1BitMask와 word2BitMask가 겹치는게 있다는 뜻이다.
        if((word1BitMask & word2BitMask) != 0){
            return false;
        }
        return false;
    }
}