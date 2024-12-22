class Solution {
    public boolean containsDuplicate(int[] nums) {
     //정수 배열 nums가 주어졌을 때, 배열 내 어떤 값이 적어도 두번이상 나타나면 true를 반환, 배열의 모든 요소가 서로 다르면 false를 반환
        
        // 주어진 건 : nums 
        // 적어도 두번 -> XOR 활용 -> 배열 내 모든 요소가 모두 다를 경우만 false
        /// 그 외에는 true로 처리
        
        // Input: nums = [1,2,3,1]
        // Output: true
        
        //  xor 연산 활용하는거 맞음
        //  xor 성질
        // 자기자신과 xor하면0이 된다
        // 0가 xor하면 자기자신이 된다.
        // 두 비트가 서로 다를 때만 결과가 1이됨
        
        // 이 문제에서는 xor를 숫자가 두 번 등장할 때 서로 소거된다는 특성 활용
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            // 두 비트가 서로 다를 때만 결과 1을 도출하니깐
            // ^= 가 0이라면 true 반환
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        
        return false;
        
    }
}