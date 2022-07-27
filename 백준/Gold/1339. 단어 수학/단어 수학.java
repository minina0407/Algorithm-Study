import java.io.*;
import java.util.Arrays;

public class Main{
    /*
   단어 -> n개의 단어로 이뤄져있다 / 대문자로만 이뤄져 있다.
   대문자를 0-9까지의 숫자 중 하나로 바꿔서 N개의 수를 합한다.
   같은 알파벳은 같은 숫자로 바꿔야 한다. 두 개 이상의 알파벳이 같은 숫자로 바뀌어 지면 안된다.
   출력 : 그 수의 합이 최대로 만들게
   // 첫 째 줄 : 단어의 개수 N개
   // 모든 단어에 포함되어있는 알파벳 : 10개
   // 수의 최대 길이는 8 이다.
   // 그럼 그 수의 합이 최대가 되도록 만들어야되니깐
   // 단어의 알파벳들 중에 가장 많이 나온 알파벳에 가장 큰 수를 부여
   // 그 다음으로 많이 나온 알파벳에 그 다음으로 가장 큰 수 를 부여

   // 알고리즘 짜기
     1. 주어진 단어에서 가장 많이 나온 알파벳 뭔지 알아보기
     2. 1번에서 찾은 알파벳에 가장 큰 수를 부여
     3. for 문 돌려서 그 다음으로 나온 알파벳에 그다음으로 가장 큰 수를 부여한다.

     */
    public static int num,answer;
    public static void main(String[] args) throws IOException {
        int[] alp = new int[26];
        // 단어의 갯수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어 주어지기
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {           
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                alp[line.charAt(j) - 'A'] += (int) Math.pow(10,line.length()-j-1);
                //  base /= 10;
            }
        }
        Arrays.sort(alp);
         num = 9;

        for (int i = 25; i >= 0; i--) {
            if (alp[i] == 0) {
                continue;
            }
            answer += (alp[i] * num);
            num--;
        }
        System.out.println(answer);


    }
}
