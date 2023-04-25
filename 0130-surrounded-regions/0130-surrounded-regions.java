
public class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;

        char[][] newBoard = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newBoard[i][j] = board[i][j];
            }
        }

        // 가장자리에서부터 시작하여 "O"가 있는 부분을 발견하면
        // captureRegion() 메서드를 호출하여 해당 영역을 찾아냄
        for (int i = 0; i < m; i++) {
            if (newBoard[i][0] == 'O') {
                captureRegion(newBoard, i, 0);
            }
            if (newBoard[i][n - 1] == 'O') {
                captureRegion(newBoard, i, n - 1);
            }
        }
        for (int j = 0; j < n; j++) {
            if (newBoard[0][j] == 'O') {
                captureRegion(newBoard, 0, j);
            }
            if (newBoard[m - 1][j] == 'O') {
                captureRegion(newBoard, m - 1, j);
            }
        }

        // 바운더리 예외처리 이후 
        //newBoard 배열을 모두 순회하면서, 
        //newBoard[i][j]가 'O'인 경우에 해당하는 board[i][j] 값을 'X'로 대체하는 코드
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (newBoard[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void captureRegion(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'X'; 

        captureRegion(board, i - 1, j);
        captureRegion(board, i + 1, j);
        captureRegion(board, i, j - 1);
        captureRegion(board, i, j + 1);
    }
}
