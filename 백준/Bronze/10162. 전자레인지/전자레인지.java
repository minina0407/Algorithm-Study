import java.util.Scanner;
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










