import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        String list[] = new String[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextLine();

        }
        class compare implements Comparator<String> { //Comparator 함수 정리 하기
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);//오름차순 // compareTo 함수 정리하기
                } else {
                    return o1.length() - o2.length();
                }
            }
        }

        Arrays.sort(list, new compare()); //array.sort함수 정리하기

        System.out.println(list[0]);

        for (int i = 1; i < N; i++) { //중복 단어 방지 로직
            if (!list[i].equals(list[i - 1])) {
                System.out.println(list[i]);
            }
        }
    }
}


