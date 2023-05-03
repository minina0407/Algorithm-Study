class Solution {
        public int openLock(String[] deadends, String target) {
    // 데드엔드 문자열들을 HashSet에 추가합니다.
    Set<String> deadSet = new HashSet<>();
    for (String deadend : deadends) {
        deadSet.add(deadend);
    }

    // bfs 함수를 호출하여 최소 횟수를 반환합니다.
    return bfs(deadSet, target);
}

    public int bfs(Set<String> deadSet, String target) {
    // 방문한 문자열들을 저장할 HashSet을 만듭니다.
    Set<String> visited = new HashSet<>();

    // BFS를 위한 Queue를 만들고 초기값 "0000"을 추가합니다.
    Queue<String> queue = new LinkedList<>();
    queue.offer("0000");
    visited.add("0000");

    int level = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            String cur = queue.poll();
            if (deadSet.contains(cur)) {
                continue;
            }
            if (cur.equals(target)) {
                return level;
            }
            for (int j = 0; j < 4; j++) {
                char c = cur.charAt(j);
                //cur.substring(0, j): 문자열 cur의 0번째부터 j-1번째까지의 부분 문자열을 가져옵니다.
                // 문자 c가 '9'인 경우 0으로 바꾸고, 그렇지 않은 경우에는 문자 c의 정수값을 구하고 1을 더한 값을 문자로 바꿉니다.
                //cur.substring(j + 1): 문자열 cur의 j+1번째부터 끝까지의 부분 문자열을 가져옵니다.
                //이렇게 가져온 세 부분 문자열을 '+' 연산자로 합쳐서 새로운 문자열 s1을 생성합니다.
                String s1 = cur.substring(0, j) + (c == '9' ? 0 : c - '0' + 1) + cur.substring(j + 1);
                String s2 = cur.substring(0, j) + (c == '0' ? 9 : c - '0' - 1) + cur.substring(j + 1);
                if (!visited.contains(s1)) {
                    queue.offer(s1);
                    visited.add(s1);
                }
                if (!visited.contains(s2)) {
                    queue.offer(s2);
                    visited.add(s2);
                }
            }
        }
        level++;
    }

    // 타겟 문자열에 도달하지 못하면 -1을 반환합니다.
    return -1;
}

}