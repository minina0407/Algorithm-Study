class Solution {
    public int minSwapsCouples(int[] row) {
        // 입력: row = [0,2,1,3]
        int N = row.length; // N = 4
        int[][] map = new int[N/2][2]; // map = new int[2][2]
        
        // map 배열 초기화
        for(int i = 0 ; i < N ; i += 2){
            // 짝 지어준거 중에 첫번째 요소
            map[i/2][0] = row[i]/2;
            // 짝 지어준거 중에 두번째 요소
            map[i/2][1] = row[i+1]/2;
        }
        // 결과: map = {{0,1}, {0,1}}
        // 설명: 0/2=0, 2/2=1, 1/2=0, 3/2=1

        int result = 0; // 교환 횟수를 저장할 변수
        
        for(int i = 0 ; i < N/2 ; i++){
            // i = 0일 때
            // 짝이 맞다면 continue
            if(map[i][0] == map[i][1]){ // 0 != 1 이므로 이 조건문은 false
                continue;
            }
            result++; // result = 1 (교환이 필요하므로 증가)
            
            for(int j = i+1 ; j < N/2 ; j++){
                // j = 1
                if(map[j][0] == map[i][0] || map[j][1] == map[i][0]){
                    // map[1][0] == map[0][0] 또는 map[1][1] == map[0][0]
                    // 0 == 0 또는 1 == 0
                    // 첫 번째 조건이 true이므로 if문 실행
                    int temp = map[i][1]; // temp = 1
                    map[i][1] = map[i][0]; // map[0][1] = 0
                    if(map[j][0] == map[i][0]){
                        map[j][0] = temp; // map[1][0] = 1
                    } else {
                        map[j][1] = temp; // 이 부분은 실행되지 않음
                    }
                    break; // 내부 for문 종료
                }
            }
            // 결과: map = {{0,0}, {1,1}}
        }
        // i = 1일 때는 map[1][0] == map[1][1]이므로 continue
        
        return result; // 1 반환
    }
}