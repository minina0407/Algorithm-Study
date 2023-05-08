class Solution {
    public int rob(int[] nums) {
    int []arr = new int[nums.length + 3];
        for (int i = 3; i < nums.length + 3; i++)
        {
            /*
           당신은 거리를 따라 집을 털 계획을 세우고 있는 전문 강도입니다. 집집마다 일정 금액의 돈이 보관되어 있는데, 각각의 집을 털지 못하게 하는 유일한 제약은 인접한 집들이 보안 시스템이 연결되어 있고 같은 날 밤에 인접한 두 집이 침입하면 자동으로 경찰에 연락을 한다는 것입니다.

각 집의 금액을 나타내는 정수 배열 번호가 주어지면, 오늘 밤 경찰에 알리지 않고 강도가 될 수 있는 최대 금액을 반환하십시오.
           */ 
            arr[i] = Math.max(arr[i - 2], arr[i - 3]) + nums[i - 3];
            // 현재 집을 털지 않을 경우와 현재 집을 털 경우의 두 가지 경우 중에서 더 큰 금액 선택
        }
        return Math.max(arr[arr.length - 1], arr[arr.length - 2]);
} 
}