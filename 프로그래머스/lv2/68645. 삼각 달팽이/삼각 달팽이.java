class Solution {
    public int[] solution(int n) {
        int[] answer = new int [n*(n+1)/2] ; // 삼각형의 크기 : 1부터 n까지의 합
        int [][] arr = new int [n][n];
        
        int x = -1 , y = 0;
        int num = 1; // 배열 값 
        while(n>0){
            
        for(int i = 0; i<n ; i++) 
        {    // 세로 
            x++;
            arr[x][y]= num;
            num++;
        }
            n--; // n 감소
            
            if(n==0)
            {break;}
        
        for(int i = 0; i<n ; i++) 
        {    // 가로 
            y++;
            arr[x][y]= num;
            num++;
        }
            n--; // n 감소
            
            if(n==0)
            {break;}
         
        for(int i = 0; i<n ; i++) 
        {    // 대각선
            x--;
            y--;
            arr[x][y]= num;
            num++;
        }
            n--; // n 감소
            
            if(n==0)
            {break;}
        
    }   
        //2차원 배열을 1차원 배열로
        int idx=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i;j++){
                answer[idx] = arr[i][j];
                idx++;
            }
        }
        return answer;
    }
}