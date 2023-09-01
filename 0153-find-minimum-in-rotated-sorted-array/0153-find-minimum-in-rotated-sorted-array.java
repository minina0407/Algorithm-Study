class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left  < right ) {
            int mid = left + ( right - left ) / 2;

            if (nums[mid] < nums[ right ]) {
                // 왼쪽에 최솟값이 존재
                right = mid;
            } else if (nums[mid] > nums[ right ]) {
                //  오른쪽에 최솟값이 존재
               left  = mid + 1;
            } else {
                // 같을떄,
                 right--;
            }
        }

        return nums[left];
    }
}
