class Solution {
    public int longestPalindrome(String[] words) {
        int res=0, maidenMirrors = 0; // 최종 결과와 거울이 되는 단어의 개수를 0으로 초기화
        HashMap<String, Integer> wordCount=new HashMap<>(); // 각 단어의 개수를 저장할 해시맵 생성
        for(String word: words) wordCount.put(word, wordCount.getOrDefault(word, 0)+1); // 각 단어의 개수를 해시맵에 저장
        for(String word: wordCount.keySet()) // 모든 단어에 대해 반복문 수행
        {
            char a = word.charAt(0), b = word.charAt(1); // 첫 번째 문자와 두 번째 문자를 추출
            int count = wordCount.get(word); // 현재 단어의 개수 추출
            if(a == b) {
                //is mirror
                maidenMirrors += count%2; // 첫 번째 문자와 두 번째 문자가 같으면 이 단어는 여자 친구 없이도 거울이 되는 단어
                res += count/2; // 거울 대칭이 되는 단어의 개수를 결과에 더함
            }
            else if(a < b && wordCount.containsKey(b+""+a)) {
                //has mirror
                res += Math.min(count, wordCount.get(b+""+a)); // 이 단어의 거울 대칭이 되는 다른 단어가 존재하는 경우, 두 단어 중 개수가 작은 것을 결과에 더함
            }
        }
        
        res *= 4; // 거울 대칭이 되는 문자열이므로 결과에 4를 곱함
        if(maidenMirrors > 0) res += 2; // 거울이 되는 단어가 하나 이상인 경우, 결과에 2를 더함
        return res; // 최종 결과 반환
    }
}
