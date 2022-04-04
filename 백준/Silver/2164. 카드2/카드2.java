import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int front = 1;
        int end = N;
        int[] queue = new int[2 * N];
        for (int i = 0; i <= N; i++) {
            queue[i] = i;
        }
        for(int j=N;j>1;j--) {
            front++;
            queue[end + 1] = queue[front];
            end++;
            front++;
        }
        System.out.println(queue[front]);


    }


}
