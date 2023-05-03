/*
두 개의 0 인덱스 정수 배열 num1 및 num2가 주어지면 크기 2의 목록 답변을 반환합니다. 여기서 다음을 수행합니다:

answer[0]는 num2에 없는 num1의 모든 고유 정수 목록입니다.
answer[1]은 num1에 없는 num2의 모든 고유 정수 목록입니다.
목록의 정수는 임의의 순서로 반환될 수 있습니다.
*/
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //둘의 배열을 비교하고, 겹치는 요소가 있으면 해당 요소를 제거 후 다시 두개의 배열을 이차원 배열에 담아 반환하기
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    List<Integer>list1 = new ArrayList<>();
    List<Integer>list2 = new ArrayList<>();
    List<List<Integer>>answer = new ArrayList<>();
      for(int n : nums1) 
          set1.add(n);
        for(int n : nums2) 
            set2.add(n);
        for (int n : set1){
            if(set2.contains(n) == false){
                list1.add(n);
            }
        }
        for (int n : set2){
            if(set1.contains(n) == false){
                list2.add(n);
            }
        }
        answer.add(list1);
        answer.add(list2);
        return answer;
    }
}