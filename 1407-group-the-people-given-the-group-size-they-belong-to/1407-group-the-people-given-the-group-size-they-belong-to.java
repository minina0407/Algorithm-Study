class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
     List<List<Integer>> result = new ArrayList<>();
      Map<Integer, List<Integer>> groups = new HashMap<>();
    for(int i = 0 ; i<groupSizes.length ; i++){
        //groupSizes[i]의 값에 맞춰 size 생성
        int size = groupSizes[i];
        // 새로운 (중복되지 않은) 사이즈라면 groups Map에 추가
        if(!groups.containsKey(size)){
            groups.put(size,new ArrayList<>());
        }
        // 만약 map에 이미 있는 사이즈라면
        // 해당 요소의 사이즈로 선언된 리스트 가져와서 요소추가
        List<Integer> group = groups.get(size);
        group.add(i);
        // 만약 그 리스트의 사이즈가 꽉 찼더라면
        // 리스트 완성 -> result 리스트에 add하기
        if(group.size() ==  size){
            result.add(new ArrayList<>(group));
            group.clear();
        }

    }
    return result;
    }
}