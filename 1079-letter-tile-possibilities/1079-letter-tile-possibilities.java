class Solution {
    public int numTilePossibilities(String tiles) {
        int n = tiles.length();
        Set<String> set = new HashSet<>(); // 중복을 제거하기 위해 Set 사용
        String[] answer = tiles.split("");
        for (int i = 0; i < answer.length+1; i++) {
            boolean[] visited = new boolean[answer.length];
            backTracking(set, answer, visited, "", i);
        }
        System.out.println(set);
        return set.size()-1;
    }

    private static void backTracking(Set<String> set, String[] answer, boolean[] visited, String s, int length) {
        if (s.length() == length) {
            set.add(s);
        }

        for (int i = 0; i < answer.length; i++) { 
            if (!visited[i]) { 
                visited[i] = true; // 사용했다고 표시
                backTracking(set, answer, visited, s + answer[i], length); // 다음 자리수 조합을 찾기 위한 재귀호출
                visited[i] = false; // 다른 조합을 찾기 위해 사용하지 않은 것으로 표시
            }
        }
    }
}
