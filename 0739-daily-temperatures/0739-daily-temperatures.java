class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] waitDay = new int[temperatures.length];
        
        Stack<Integer> stack = new Stack<>();
      
       for(int i = 0 ; i<temperatures.length ; i++){
                 // 스택이 비어있지않고 현재 온도가 스택의 top보다 높을 경우
           // 스택의 top에 해당하는 인덱스를 pop하고
              // 현재 인덱스와 pop한 인덱스의 차이를 waitDay에 넣어준다.
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
               int index = stack.pop();
              waitDay[index] = i - index;
           }
          stack.push(i);
        }
        return waitDay;

    }
}