import java.util.*;

class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> sub= new HashMap<>();
        for (int num : nums) {
            if (!sub.containsKey(num)) 
               sub.put(num, new PriorityQueue<>());
            
            if (sub.containsKey(num - 1)) {
                // num-1로 끝나는 서브 시퀀스 존재하면
                // 가장 짧은 서브 시퀀스의 길이를 가져옴
                int prevLength = sub.get(num - 1).poll();

               // 해당 서브 시퀀스가 더 이상 없다면 삭제
                if (sub.get(num - 1).isEmpty()) 
                    sub.remove(num - 1);
                // 커진다면 하나 더 확장
               sub.get(num).offer(prevLength + 1);
            } else {
                // 새로운 서브 시퀀스 시작 
                sub.get(num).offer(1);
            }
        }
        
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : sub.entrySet()) {
            if (entry.getValue().peek() < 3)
            //3 미만이면 false
                return false;
        }
        
        return true;
    }
}
