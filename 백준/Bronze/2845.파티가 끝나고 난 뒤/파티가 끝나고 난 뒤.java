import java.util.Scanner;

public class Main {
 public static void main(String[] args)
 {
    /*
    1m^2 당 몇 명의 사람이 있는지 알고 있다.
    첫째 줄 : 1m^2당 사람의 수 -> L / 넒이 : P
    넒이 X 사람 = 정확한 사람 수
    둘쨰줄 : 각 기사에 실려있는 참가자 수  -> < 10^6
    1. Scanner을 통해 사람의 수와 넒이 입력받기
    2. 정확한 사람 수 = 넒이 X 사람
    3. 각 기사의 참가자 수는 배열로 입력받기 (for문 사용)
    4. 각 기사에 실려있는 참가자 수 - 정확한 사람 수 = 차이 출력하기
    * */
     Scanner scan=new Scanner(System.in);
     int l,p,people,minus;
     l=scan.nextInt();
     p=scan.nextInt();
     people=l*p;
     int[] n=new int[5];
     for (int i=0;i<n.length;i++){
         n[i]=scan.nextInt();
         minus=n[i]-people;
         System.out.println(minus);
     }
        }
 }
