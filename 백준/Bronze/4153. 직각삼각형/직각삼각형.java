
import java.util.Scanner;

/*
 각변의 길이가 3,4,5인 삼각형이 직각 삼각형인것을 알아냇다.
 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분
 직각삼각형의 성질은
 빗변의 제곱은 높이의 제곱 + 밑변의 제곱이다.
 세변의 길이를 입력받아
 제일큰변의 길이 -> 빗변으로 설정
 나머지 둘의 길이를 각각 제곱
 만약 제일 긴 변의 길이의 제곱 = 나머지 두변의 제곱의 합과
 같다면 right 출력, 아니라면 wrong출력
 */
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //아그럼 애네 배열에 담아서 제일  큰 원소 출력하게 하자
        int a = 0, b = 0, c = 0;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == 0 && b == 0 && c == 0) break;

            a = a * a;
            b = b * b;
            c = c * c;
            if (a == b + c || b == a + c || c == a + b) {
                System.out.println("right");
            } else
                System.out.println("wrong");

        }
    }
}
