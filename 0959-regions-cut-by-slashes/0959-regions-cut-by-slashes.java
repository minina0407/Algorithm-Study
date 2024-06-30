class Solution {
    public int regionsBySlashes(String[] grid) {
        // 일단 grid에 존재하는 문자열의문자를 각각 분리하기 위해
        // 이차원 배열에다가 각각의 문자를 넣어준다.
        int N = grid.length;
        // 3배로 늘려주는 이유 : 슬러쉬 하나를 세개의 선(1)으로 나눠서 계산하기 편하게 생각하기 위해
        int[][] map = new int[N * 3][N * 3];
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j< grid[i].length() ; j++){

                // grid[i].charAt(j) == ' ' 이면 0으로 채워준다.
                if(grid[i].charAt(j) == ' '){
                    continue;
                }
                // grid[i].charAt(j) == '/' 이면 1로 채워준다.
                if(grid[i].charAt(j) == '/'){
                   // 오른쪽 상단 모서리
                    map[i*3][j*3+2] = 1;
                    // 중앙
                    map[i*3+1][j*3+1] = 1;
                    // 왼쪽 하단 모서리
                    map[i*3+2][j*3] = 1;


                }
                // grid[i].charAt(j) == '\' 이면 2로 채워준다.
                if(grid[i].charAt(j) == '\\'){
                    //왼쪽 상단 모서리
                    map[i*3][j*3] = 1;
                    // 중앙
                    map[i*3+1][j*3+1] = 1;
                    // 오른쪽 하단 모서리
                    map[i*3+2][j*3+2] = 1;
                }

            }

        }
        // 결과값을 저장할 변수
        int result = 0;
        // 3x3으로 나눠서 생각하기 위해 2배로 늘려준다.
        for(int i = 0 ; i<map.length ; i++){
            for(int j = 0 ; j<map[i].length ; j++){
                // 연결된 지점이라면 dfs 호출
                if(map[i][j] == 0){
                    dfs(map, i, j);
                    result++;
                }
            }
        }
        return result;
    }
    // dfs 호출
    private void dfs(int[][] map, int x, int y){
        // 만약 x가 0보다 작거나, y가 0보다 작거나, x가 map.length 보다 크거나, y가 map[x].length 보다 크다면 return
        if(x < 0 || y < 0 || x >= map.length || y >= map[x].length){
            return;
        }
        // 만약 map[x][y] 가 0이 아니라면 return
        if(map[x][y] != 0){
            return;
        }
        // map[x][y] 를 1로 바꿔준다.
        map[x][y] = 1;
        // dfs 호출
        dfs(map, x-1, y);
        dfs(map, x+1, y);
        dfs(map, x, y-1);
        dfs(map, x, y+1);
    }
}