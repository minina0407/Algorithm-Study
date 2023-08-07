class Solution {
public int countSubIslands(int[][] grid1, int[][] grid2) {
    boolean[][] visited = new boolean[grid2.length][grid2[0].length];
    int count = 0;
    
    for (int i = 0; i < grid2.length; i++) {
        for (int j = 0; j < grid2[0].length; j++) {
            if (grid2[i][j] == 1 && !visited[i][j]) {
                if (checkSubIsland(i, j, grid1, grid2, visited)) {
                    count++;
                }
            }
        }
    }
    return count;
}
    private boolean checkSubIsland(int i, int j, int[][] grid1,int[][] grid2, boolean[][] visited) {
    if (i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0 || visited[i][j]) {
        return true;
    }

	boolean isSub = grid1[i][j] == 1; // grid1도 섬인지 확인
    visited[i][j] = true;
    isSub&=checkSubIsland(i-1,j,grid1,grid2,visited);
    isSub&=checkSubIsland(i+1,j,grid1,grid2,visited);
    isSub&=checkSubIsland(i,j-1,grid1,grid2,visited);
    isSub&=checkSubIsland(i,j+1,grid1,grid2,visited); 
    return isSub;
}
}