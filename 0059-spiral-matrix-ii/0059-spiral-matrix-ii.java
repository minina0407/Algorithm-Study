class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n]; // n x n 크기의 2차원 배열 생성
        
        // 초기화
        int counter = 1; // 카운터 변수
        int up = 0; // 윗쪽 
        int left = 0; // 왼쪽 
        int right = n-1; // 오른
        int down = n-1; // 아래
        
        // 배열 채우기
        while(counter <= n*n){ // 배열이 모두 채워질 때까지 반복
            // 왼쪽에서 오른쪽으로 채우기
            for(int i = left ; i<= right ; i++){
                arr[up][i] = counter++; // 해당 위치에 값을 채우고 카운터 증가
            }
            up++; // 윗쪽 한 칸 아래로 이동
            
            // 위에서 아래쪽으로 채우기
            for(int i = up ; i<=down  ; i++){
                arr[i][right] = counter++; // 해당 위치에 값을 채우고 카운터 증가
            }
            right--; // 오른쪽을 한 칸 왼쪽으로 이동
            
            // 오른쪽에서 왼쪽으로 채우기
            for(int i = right ; i>= left ; i--){
                arr[down][i] = counter++; // 해당 위치에 값을 채우고 카운터 증가
            }
            down--; // 아래쪽을 한 칸 위로 이동
            
            // 아래쪽에서 위쪽으로 채우기
            for(int i = down ; i>= up ; i--){
                arr[i][left] = counter++; // 해당 위치에 값을 채우고 카운터 증가
            }
            left++; // 왼쪽 경계를 한 칸 오른쪽으로 이동
        }
        return arr; // 생성된 배열 반환
    }
}
