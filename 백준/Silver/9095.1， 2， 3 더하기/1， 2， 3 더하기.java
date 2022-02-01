import java.util.Scanner;


 public class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int T = scan.nextInt(); // 테스트 갯수 입력받기
         int[] n = new int[11];
         int N;
         for (int j = 1; j <= T; j++) {
              N=scan.nextInt();
             n[0] = 1;
             n[1] = 1;                                   ;
             n[2] = 2;
             for (int i = 3; i <= N; i++) {
               n[i] = n[i-1] + n[i-2] + n[i - 3];

             }
             System.out.println(n[N]);

         }
     }

 }










