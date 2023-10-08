class Solution {
    public int minReorder(int n, int[][] connections) {
        // 0으로 가는 그래프로 만드는 최소한의 변경 횟수 
    List<List<int[]>> g = new ArrayList<>();
    for(int i = 0 ; i < n ; i++){
        g.add(new ArrayList<>());

    }
    for(int[] con : connections){
        int from = con[0];
        int to = con[1];
        g.get(from).add(new int[]{to,1});
        g.get(to).add(new int[]{from,0});

    }
    int[]answer = new int[]{0};
    boolean[] visited = new boolean[n];
    dfs(g,visited,0,answer);
    return answer[0];
    }
    private void dfs(List<List<int[]>> g, boolean[] visited,int node, int[] answer){
        visited[node] = true;
        for(int[] edge : g.get(node)){
            int n = edge[0];
            int direc = edge[1];
            if(!visited[n]){
                answer[0] +=direc;
                dfs(g,visited,n,answer);
            }
        }
    }
}