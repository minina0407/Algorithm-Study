
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        int N = in.nextInt();
        int start = 0;

        // N 번 반복
        while (N-- > 0) {
            int value = in.nextInt();
            if (value > start) {
                // start + 1부터 입력받은 value 까지 push를 한다.
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    list.add("+");
                }
                start = value;    // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            // top에 있는 원소가 입력받은 값과 같이 않은 경우
           if (stack.peek() == value) {
                stack.pop();
                list.add("-");
            }
           else {
               System.out.println("NO");
               return;
           }
        }
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}

