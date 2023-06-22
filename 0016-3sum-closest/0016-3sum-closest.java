class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // target과 가까운 최소 합계
        int minSum = nums[0] + nums[1] + nums[2];
        // target과의 최소 차이
        int minDiff = Math.abs(minSum - target);

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int cur = nums[i];
            //왼쪽 포인터는 다음 원소
            int left = i + 1;
            //오른쪽 포인터는 배열의 마지막 요소
            int right = nums.length - 1;

            // 왼쪾이 오른쪽보다 작은 동안 반복
            while (left < right) {
                // 3개의 원소의 합을 출력해야하니
                // 현재 원소 + 다음 원소 + 맨 끝 원소 
                int curSum = cur + nums[left] + nums[right];

                //만약 현재 Sum 이 Target과 같다면 그 SUM 출력 
                if (curSum == target) {
                    return curSum;
                }

                int curDiff = Math.abs(curSum - target);

                // 현재 차이가 최소차이보다 작을 경우 최소차이와 최소 합 업데이트 
                if (curDiff < minDiff) {
                    minDiff = curDiff;
                    minSum = curSum;
                }
                 // 현재 합계가 타켓보다 작다면 
                 // left 증가 (합계 더 커지게 )
                 // 현재 합계가 타켓보다 크다면 right 감소 ( 합계 더 작아지게 )
                if (curSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return minSum;
    }
}
