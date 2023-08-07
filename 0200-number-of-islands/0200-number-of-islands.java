class Solution {
    public int numIslands(char[][] grid) {
    /*
    '1'(대지)과 '0'(물)의 지도를 나타내는 m x n 2D 이진 그리드 그리드가 주어지면 섬의 수를 반환합니다.
섬은 물로 둘러싸여 있고 인접한 땅을 수평 또는 수직으로 연결하여 형성됩니다. 
격자의 네 모서리 모두가 물로 둘러싸여 있다고 가정할 수 있습니다.
    */
     boolean[][] visited = new boolean[grid.length][grid[0].length];
     int count = 0; 
     for(int i=0 ; i<grid.length ; i ++){
         for(int j = 0 ; j<grid[0].length ; j++){
             if(grid[i][j]=='1'&& !visited[i][j]){
                 checkIslands(i,j,grid,visited);
                 count ++;
             }
         }
     }
     return count;
    }
    private void checkIslands (int i  , int j , char[][] grid ,boolean[][] visited)
{
  if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || visited[i][j]) {
        return ;
    }
    visited[i][j] = true;
    checkIslands(i-1,j, grid, visited);
     checkIslands(i+1,j, grid, visited);
      checkIslands(i,j-1, grid, visited);
       checkIslands(i,j+1, grid, visited);
}
}