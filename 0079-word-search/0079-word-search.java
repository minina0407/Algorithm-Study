class Solution {
 public boolean exist(char[][] board, String word) {
         char[] s= word.toCharArray();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0 ; i< board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j]==s[0]){
                    if(captureRegion(board,i,j, s,visited, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
     private boolean captureRegion(char[][] board, int i, int j,char[] s,boolean[][] visited,int index) {    
         if (index == s.length) {
            return true;
        }
         if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != s[index] || visited[i][j]) {
             return false;
        }
     
        visited[i][j] = true;
         
        boolean result= captureRegion(board, i - 1, j,s,visited,index+1)            
        || captureRegion(board, i + 1, j,s,visited,index+1)
        || captureRegion(board, i, j - 1,s,visited,index+1)
        || captureRegion(board, i, j + 1,s,visited,index+1);
         visited[i][j] =false;
         return result;
    }
}