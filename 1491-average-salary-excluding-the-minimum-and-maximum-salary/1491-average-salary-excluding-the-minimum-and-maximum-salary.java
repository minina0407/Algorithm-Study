class Solution {
    public double average(int[] salary) {
        /*
        고유 정수 급여 배열이 주어집니다. 여기서 급여는 i번째 직원의 급여입니다.

최소 및 최대 급여를 제외한 직원의 평균 급여를 반환합니다.
실제 답변의 10-5 이내의 답변이 허용됩니다.
*/
        //int 배열의 최댓값이랑 최소값 먼저 구한 후
        // 해당 값을 배열에서 삭제
        // 평균 값 계산
        // 그럼면 stack으로 변환 후에 풀자 
        int max = 0; 
        int min = Integer.MAX_VALUE;
        double sum = 0; 
        double answer = 0; 
        for(int i = 0 ; i<salary.length; i++){
            if(salary[i]<min){
                min = salary[i];
            }
            if(salary[i]>max){
                max = salary[i];
            }
        }
      List<Integer> list = new ArrayList<>();
        for(int s : salary){
            list.add(s);
        }
        list.remove(Integer.valueOf(min));
        list.remove(Integer.valueOf(max));
        for(int i = 0 ; i<list.size(); i++){
        
         sum += list.get(i);

        }
         double avg = sum/list.size();
         answer = avg;
        return answer;
    }
   
}