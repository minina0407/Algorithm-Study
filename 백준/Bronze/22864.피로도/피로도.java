import java.util.Scanner;
/*
하루에 한 시간 단위로 일을 하거나 / 쉬거나
한시간 일 : 피로도 +A / 일 B+
한시간 휴식 : 피로도 -C
피로도가 음수 -> 0으로 변환
최대 M을 넘지 않게
출력 : 최대 얼마나 일을 할 수 있는지(w)구하기
단 하루는 24시간인것을 주의하자

매시간 일할때, 피로도 M을 넘으면 휴식하고
피로도 m을 넘지 않으면 일을 하는 식으로 작성

그러면 그리디니깐...분명 공통적인 특징 있을거야
for문 말고 재귀함수를 써보자
*
* */


 public class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int a,b,c,m,tired;
         tired=0;
            int count=0;
         a= scan.nextInt();
         b= scan.nextInt();
         c= scan.nextInt();
         m= scan.nextInt();
    int sum=0;

        for(int i=0;i<24;i++){
            //만약에 피로도가 m보다 작으면 count 증가시기
            if(tired+a<=m){
            tired+=a;
            count++;}
            else {
                tired-=c;
                if(tired<0){
                    tired=0;
                }
            }



            }

        System.out.println(count*b);

     }

 }










