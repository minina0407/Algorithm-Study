class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        // 그리드 내 방문 여부를 체크하기 위한 2차원 boolean 배열
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        // 최대 영역 크기를 저장할 변수
        int Max = 0;
        // 그리드 전체를 탐색하며, 육지가 발견되면 해당 영역의 크기를 계산한다.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    // 발견된 육지가 아직 방문되지 않았다면, 해당 영역의 크기를 계산한다.
                    Max = Math.max(Max, checkIslands(i, j, grid, visited));
                }
            }
        }
        // 최대 영역 크기 반환
        return Max;
    }

    // DFS를 이용해 육지 영역 크기를 계산하는 함수
    private int checkIslands(int i, int j, int[][] grid, boolean[][] visited) {
        // 그리드 범위를 벗어나거나, 해당 좌표가 물(0)인 경우, 이미 방문한 경우에는 크기를 계산하지 않는다.
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        // 육지(1)이 발견되면, 크기를 1 증가시키고 방문 표시를 한다.
        int count = 1 ;
        visited[i][j] = true;
        // 상하좌우를 탐색하며, 인접한 육지 영역을 모두 탐색한다.
        count += checkIslands(i-1, j, grid, visited);
        count += checkIslands(i+1, j, grid, visited);
        count += checkIslands(i, j-1, grid, visited);
        count += checkIslands(i, j+1, grid, visited); 
        // 계산된 육지 영역 크기를 반환한다.
        return count;
    }
}
