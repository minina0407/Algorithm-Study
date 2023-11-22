class Solution {
   private long maxStrength;
    public long maxStrength(int[] nums) {
        maxStrength = Integer.MIN_VALUE;
        findMaxStrength(nums, 0, 1, 0);
        return maxStrength;

       }
       private void findMaxStrength(int[] nums, int index, long stu, int size) {
        // 1. index가 nums.length보다 크거나 같으면
        // 2. size가 0이 아니면
        // 3. maxStrength와 stu를 비교해서 작은 값을 maxStrength에 넣어준다.
           // maxStrgenght와 stu가 뭔데?
              // maxStrength는 최대값을 저장하는 변수
                // stu는 nums의 요소들을 곱한 값
           // 왜 작은 값을 return?
                // 최대값을 구하는 문제이기 때문에 최대값을 구하기 위해서
           if(index >= nums.length){
               if(size!=0) maxStrength = Math.max(maxStrength, stu);
               return ;

           }
        // 설명
        // dp 를 이용하여
           // 요소들의 곱 중 최대값을 구한다.
           findMaxStrength(nums, index+1, stu *nums[index], size+1);
           findMaxStrength(nums, index+1, stu, size);
       }
}