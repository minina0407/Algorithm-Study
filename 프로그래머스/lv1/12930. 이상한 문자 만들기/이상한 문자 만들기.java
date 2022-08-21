 class Solution {
    public String solution(String s){
        String answer="";
        String[] array = s.split("");
        int count = 0;
        for(int i = 0 ; i<array.length;i++){
            
            if(array[i].equals(" ")){
                //띄어쓰기 단위로 count 초기화하기 ->왜? 단어 단위로 짝,홀수 판단 해야되기때문에
                count = 0;
            }
            
         else if(count %2 == 0){
             array[i] = array[i].toUpperCase();
             count++;
         } 
            else if (count %2 != 0) {
             array[i] = array[i].toLowerCase();
             count++;
         }
            answer += array[i];
        }
        return answer;
    }
}