class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (countMap.containsKey(key)) {
                //만약에 두번이상 등장하면 해당 키를 가져와서 해당키의 count를 증가시키기 
                int count = countMap.get(key);
                countMap.put(key, count + 1);
            } else {
                countMap.put(key, 1);
            }
        }
        //entrySet은 Map의 메서드 중 하나로, Map에 저장된 요소들을 Map.Entry 형태로 반환하는 메서드
        //entrySet을 사용하여 map의 모든 요소를 순회
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count =  entry.getValue();
            if(count > 1){
                return true;
            }
        }
        return false;
    }
}