class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] waitDay = new int[temperatures.length];
        
        Stack<Integer> stack = new Stack<>();
      
       for(int i = 0 ; i<temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
               int index = stack.pop();
              waitDay[index] = i - index;
           }
          stack.push(i);
        }
        return waitDay;

    }
}