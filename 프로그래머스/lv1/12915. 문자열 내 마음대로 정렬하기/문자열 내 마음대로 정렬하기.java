import java.util.Arrays;
import java.util.Comparator;

class Solution {
   public String[] solution(String[] strings, int n) {
        class compare implements Comparator<String> { //Comparator 함수
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) { // 문자열의 길이가 같다면
                    return o1.compareTo(o2);// 오름차순으로 정렬 -> o1의 값이 더 크면 양수를 리턴하여 뒤로가게되므로 오름차순으로 정렬된다.
                } else {
                    if(o1.charAt(n) > o2.charAt(n))
                        return 1;
                    else return -1;
                    // 만약 o1의 문자열의 길이가 o2보다 크다면 양수 반환 , 작다면 음수 반환
                }
            }
        }
        Arrays.sort(strings,new compare());
        return strings;
    }
}