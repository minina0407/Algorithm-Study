import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // 문자열의 개별 문자 빈도수 세기
        HashMap<Character, Integer> characterCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            characterCountMap.put(currentChar, characterCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // 내림차순으로 정렬된 큐(우선순위 큐) 생성
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(characterCountMap.entrySet());

        // 우선순위 큐를 활용해 정렬된 문자열 생성
        StringBuilder sortedString = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                sortedString.append(entry.getKey());
            }
        }

        return sortedString.toString();
    }
}
