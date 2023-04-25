class Solution {
    // 모든 경로를 저장할 리스트 생성
    private final List<List<Integer>> allPaths = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 그래프의 모든 엣지를 해시맵에 저장
        Map<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                edges.computeIfAbsent(i, val -> new ArrayList<>()).add(graph[i][j]);
            }
        }
        // DFS로 모든 경로 찾기
        helper(edges, new ArrayList<>(), 0, graph.length - 1);
        return allPaths;
    }

    private void helper(Map<Integer, List<Integer>> edges, List<Integer> curPaths, int source, int target) {
        // 현재 경로에 출발 노드 추가
        curPaths.add(source);
        // 도착 노드에 도달한 경우 경로 리스트 allPaths에 추가하고 return
        if (source == target) {
            allPaths.add(curPaths);
            return;
        }
        List<Integer> nodes = edges.get(source);
        
        // 출발 노드와 연결된 노드가 없는 경우 return
        if (nodes == null) return;
        
        for (int node : nodes) {
            // DFS 재귀호출을 위해 현재 경로를 복사하여 새로운 객체로 전달
            helper(edges, new ArrayList<>(curPaths), node, target);
        }
    }
}
