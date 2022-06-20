class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0; // 몇 라운드에서 붙게 되는지
      
        while(a!=b){
            a=a-a/2;
            b=b-b/2;
            answer++;
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}