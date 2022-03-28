
/*
N 명의 참가자는 번호를 1~N까지 배정받는다.
서로 인접한 번호끼리 게임한다.
이긴 사람 진출, 진 사람은 떨어진다.
만약 그 라운드의 참가자가 홀수 명 -> 마지막 번호 가진 사람은 자동 다음 라운드 진출
매 라운드마다번호를 1번부터 매긴다.
순서는 처음 번호의 순서 유지하면서 1번부터 매긴다.

김지민과 임한수는 서로 대결하기 전까지는 항상 이긴다고 가정
1랑누드에서 김지민, 임한수의 번호 주어짐
몇 라운드에서 대결하는지 출력

입력 : 참가자의 수 - N  / 김지민,임한수의 번호
2<N<=100000
임한수,김지민의 번호 <=N -> 서로 다르다

출력 : 대결하는 라운드 번호 출력 / 서로 대결하지 않을때는 -1 출력
 */

import java.util.Scanner;

public class Main{

     public static void main(String[] args) {
  
         int N = 0,k, l; // 참가자 수, 김지민, 임한수의 번호
         Scanner sc=new Scanner(System.in);
         N= sc.nextInt();
         k=sc.nextInt();
         l=sc.nextInt();
        int count=0;
        while (k!=l){
            k=k-k/2;
            l=l-l/2;
            count++;
        }
        System.out.println(count);

    }

}
