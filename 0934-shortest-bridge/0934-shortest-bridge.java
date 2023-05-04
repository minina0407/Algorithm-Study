class Solution {
    public int shortestBridge(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        List<int[]> island1 = new ArrayList<>(); // 첫 번째 섬의 위치 리스트
        List<int[]> island2 = new ArrayList<>(); // 두 번째 섬의 위치 리스트
        boolean foundIsland1 = false;

        // 첫 번째 섬의 위치를 찾습니다.
        for (int i = 0; i < grid.length; i++) {
            if (foundIsland1) break;// 이미 섬을 찾았으면 break;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    // 방문하지 않았고, 1이라면 
                    // dfs함수 호출
                    findIsland(i, j, grid, visited, island1);
                    // 이후 첫번째 섬 위치 방문 true로 변경 
                    foundIsland1 = true;
                    break;
                }
            }
        }

        // 두 번째 섬의 위치를 찾습니다.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    findIsland(i, j, grid, visited, island2);
                    break;
                }
            }
        }

        int minDistance = Integer.MAX_VALUE;
        // 두 섬 사이의 최소 거리를 찾습니다.
        for (int[] pos1 : island1) {
            for (int[] pos2 : island2) {// 좌표계산 
                int distance = Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]) - 1;
                minDistance = Math.min(minDistance, distance);
            }
        }
        return minDistance;
    }

    // DFS 로 섬의 위치를 찾아 리스트에 추가합니다.
    private void findIsland(int i, int j, int[][] grid, boolean[][] visited, List<int[]> island) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == 0) {
            return;
        }
        visited[i][j] = true;
        island.add(new int[] {i, j});
        findIsland(i - 1, j, grid, visited, island);
        findIsland(i + 1, j, grid, visited, island);
        findIsland(i, j - 1, grid, visited, island);
        findIsland(i, j + 1, grid, visited, island);
    }
}
