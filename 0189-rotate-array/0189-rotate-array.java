class Solution {
    public void rotate(int[] nums, int k) {
        //deque로 변환
        //k만큼 반복문 반복해서 removeLast 한후
        // addFirst하기
        Deque<Integer> deque = new LinkedList<>();
        int rotation = k % nums.length; 
        int[] ele = new int[nums.length];
        
        if (nums.length <= 1 || k <= 0) {
            return;
        }

        for(int i = 0 ; i<nums.length ; i++){
            deque.add(nums[i]);
        }
        for(int i = 0 ; i<rotation ; i++){
          ele[i]  = deque.pollLast();
        }
        for(int i = 0 ; i<rotation ; i++){
            deque.addFirst(ele[i]);
        }
        int index = 0;
        for (Integer num : deque) {
            nums[index++] = num;
        }

    }
}