
class Solution {
    public int singleNumber(int[] nums) {
        //한번만 나타나는 요소를 찾으세요
        int single = 0;
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for (int num : nums) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1); //num과 num별 횟수 저장
        }
        for (int num : numsCount.keySet()) { ////모든 num에 대해 반복문 수행
            int count = numsCount.get(num);// 현재 num의 갯수 추출 
            if (count == 1) { //한번만 나타나는 요소 single로
               single = num;
            }
        }
        return single;

    }
}