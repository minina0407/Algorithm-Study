class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
    Map<Integer, List<Integer>> map = new HashMap<>(); // 숫자와 그 이웃들을 저장할 맵 생성

        // 각 숫자 쌍에 대해
        for (int[] pair : adjacentPairs) {
            if (!map.containsKey(pair[0])) { // 숫자가 맵에 없으면 새로운 리스트 생성
                map.put(pair[0], new ArrayList<>());
            }
            if (!map.containsKey(pair[1])) { // 숫자가 맵에 없으면 새로운 리스트 생성
                map.put(pair[1], new ArrayList<>());
            }
            map.get(pair[0]).add(pair[1]); // pair[0]이 pair[1]의 이웃
            map.get(pair[1]).add(pair[0]); // pair[1]이 pair[0]의 이웃
        }

        int start = 0; 
        // 맵의 각 항목에 대해
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            // 한 번만 이웃하는 숫자가 있다면 -> 가장 적게 언급되는 숫자 -> 가장 끝자리들에 위치
            if (entry.getValue().size() == 1) {
                start = entry.getKey(); // 그 숫자를 시작 숫자로 설정
                break;
            }
        }

        int[] answer = new int[adjacentPairs.length + 1]; 
        answer[0] = start; // 가장 적게 언급된 숫자를 정답배열의 첫번째 원소로 설정
        answer[1] = map.get(start).get(0); // 시작 숫자의 친구를 찾아서 두 번째 카드로 설정하는 과정
        // 예를 들어, 시작 숫자가 1이고 1의 친구가 2라면, 두 번째 카드는 2

        // 나머지 배열 복원
        for (int i = 2; i < answer.length; i++) {
            List<Integer> neighbors = map.get(answer[i - 1]); // 아까 기록했던 숫자의 이웃 리스트 가져오기
            answer[i] = neighbors.get(0) == answer[i - 2] ? neighbors.get(1) : neighbors.get(0); 
            // 숫자 이웃 리스트의 첫번째요소가 이전에 찾아본 요소와 같을 경우 다음 이웃을 선택,
            // 아니라면 첫번째 요소를 선택
            // i-2인이유는 현재 숫자 이전에 방문했던 숫자를 뒤져보는것 
            // 어차피 요소와 이웃된 요소들은 저장했기떄문
        }

        return answer; 
    }
}
