import java.util.*;
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
         // 인접리스트
        List<Integer>[] adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        // 방문 배열 선언
        int[] visited = new int[n+1];
        // 인접리스트에 값 넣기 -> 양쪽으로 넣어주는 이유 : 양방향 그래프이기 때문
        for(int[] dislike : dislikes){
            adj[dislike[0]].add(dislike[1]);
            adj[dislike[1]].add(dislike[0]);
        }
        // dfs 호출
        for (int i = 1; i <= n; i++) {
            if(visited[i] == 0 && !dfs(adj, visited, i, 1)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(List<Integer>[] adj, int[] visited, int node, int color){
        visited[node] = color;
        for (int i : adj[node]) {
            if(visited[i] == color){
                return false;
            }
            if(visited[i] == 0 && !dfs(adj, visited, i, -color)){
                return false;
            }
        }
        return true;
    
    }
}