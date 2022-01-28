import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    1. 버튼을 k 번 입력받기
    2. 배열로 받아야겠지
    3. 재귀 호출의 각 단계에서 최적해를 만들었던 선택을 별도의 배열에 저장
    4. 별도의 재귀함수를 이용해 이 선택을 따라가며 각 선택지를 저장

    그러면 재귀함수를 활용해보자 배운거를 써먹어보자!
    A가 들어갈 경우 B로 바꾸고, B가 들어갈 경우 A로 바꾸는 함수를 작성해서
    이 함수를 호출해보자
    그럼 배열을 두개를 선언해야겠지
    
    1일 때는 A의 개수는 0, B의 개수는 1
    1이 아닐때는 
    B의 개수는 1씩 증가
    A의 개수는 2차례마다하나씩 증가
    그럼 K만큼 FOR문돌려서
    A는 K/2한 변수를 출력
    B는 K-1을 출력
    * */
        Scanner scan = new Scanner(System.in);
        int k=scan.nextInt();
        int A=0; int B=1;
        int sum=0;
        for(int i=1;i<k;i++){
            sum=A+B;
            A=B;
            B=sum;
        }
        System.out.println(A);
        System.out.println(B);
    }
}




