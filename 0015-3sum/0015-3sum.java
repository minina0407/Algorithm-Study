class Solution {
public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // 배열을 정렬

        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) { // 하나는 i-1, 하나는 i+1할거기때문에 nums.length-2
            if (i > 0 && nums[i] == nums[i - 1]) { // 이전에 선택한 숫자와 같은 숫자는 다시 선택하지 않음
                continue;
            }

            int left = i + 1; // 두번째 수 ( 첫번째는 고정 )
            int right = nums.length - 1; // 세번째 수 ( 마지막 )

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++; // 합이 0보다 작다 => 두번째와 세번째 수 합이 첫번째 수보다 작다.
                } else if (sum > 0) {
                    right--; // 합이 0보다 크면 => 두번째와 세번째 수 합이 첫번째 수 보다 크다.
                } else {// 두번째 수와 세번째수의 합이 첫번째 수와 같을 경우
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 중복 제거
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return answer;
    
}
}