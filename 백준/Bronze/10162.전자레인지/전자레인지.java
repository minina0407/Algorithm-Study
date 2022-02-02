import java.util.Scanner;
/*
A-5분 / B- 1분 / C-10초
A - 300초 / B-60초 / C-10초
T : 요리해야할 시간
단 버튼 누른 횟수의 합은 항상 최소가 되어야 한다.
첫번째는 T초가 주어진다. 범위는 만 미만
최소버튼을 위한 A,B,C횟수를 첫 줄에 차례대로 출ㄺ
해당버튼을 누르지 않는 경우 0출력
제시된 3게의 버튼으로 T초 맞출 수 없으면 음수 -1을 첫줄에 출력
즉 끝자리가 0이 아닐경우에는 -1을 출력한다.
그리디 알고리즘은 현재 상황에서 지금 당장 좋은 것만 고르는 방법이다.
이문제에서는 가장 큰 시간 단위부터 누르는 것이다.
큰 시간 단위부터 차례대로 반복문돌리기
해당 시간 단위로 누를 수 있는 횟수 세기

1. T 입력받기
2. 시간 단위대로 나눠서 해당하면 count++하기
*
* */


 public class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int countA = 0; int countB = 0; int countC = 0;
         // T 입력받기
         int T = scan.nextInt();
         //가장 큰 단위의 초부터
         //만약 T가 300초보다 크다면 300초로 먼저 나눈 후, 그 나머지가 60이상일 경우
         // 60초의 경우로 넘겨주기
         while (T>=10) {
             if (T >= 300) {
                T-=300;
                countA++;
             }
             else if (T >= 60 ) {
                 T-=60;
                 countB++;

             }
             else if (T >= 10) {
                 T-=10;
                 countC++;

             }


         }
          if (T % 10 != 0) {
             System.out.println(-1);
         }
          else {
              System.out.println(countA + " " + countB + " " + countC);
          }

     }

 }










