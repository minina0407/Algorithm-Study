import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // 문자 빈도수 세기
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        // 빈도수 높은 대로 내림차순 정렬 ( 우선 순위 큐 이용 )
        // 사전순정렬  ( 같을 경우 )
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue().equals(a.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()
        );

        maxHeap.addAll(countMap.entrySet());

       
        List<String> answer = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            //heap원소들 추출
            answer.add(maxHeap.poll().getKey());
        }
        return answer;
    }
}
