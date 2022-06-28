import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        // 이동하는 거리가 주어졌을 때, 사용해야하는 건전지 사용량의 최솟값을 return
        /// 순간이동하는 경우에는, 에너지 소모 없음
        // 그럼 점프할때만 ans  ++ 
        while(n!=0){
            if(n %2 == 0)
            {    n =  n /2 ; }
            else
            {    n--; 
                 ans ++; }
        }
            return ans;
}
}
