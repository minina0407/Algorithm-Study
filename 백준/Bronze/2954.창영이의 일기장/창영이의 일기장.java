import java.util.Scanner;
import java.util.StringTokenizer;

/*
모음 바로 다음에 p를 쓰고 p를 쓴 다음에는 그 모음을 다시 작성
공백으로 단어를 구분
그럼일단 문장을 입력받고, 띄어쓰기 단위로 단어를 구분한다.
그 다음에는 단어 내에 모음이 있나 없나를 판별(if문 이용)
1. 만약에 모음이라면 -> 모음의 갯수만큼 단어 내의 p 삭제  그 다음에 그 모음을 모음 갯수만큼 삭제(동일한 모음 삭제_
2. 모음이 아니라면 패스하기

* */
public class Main{

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        String str;
        str=scan.nextLine();
        String input=str.replaceAll("apa","a").replaceAll("epe","e").replaceAll("ipi","i")
                .replaceAll("opo","o").replaceAll("upu","u");
        System.out.println(input);
    }
    }




