import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //첫쨰줄에 정수 N개가 주어진다.
    // 둘쨰 줄부터는 N개의 줄에는 N개의수가 주어진다.
    // 정수 하나를 빼서 만들 수 있는 가장 큰 공약수 출력
    // 공백을 출려한 다음 뺸 수를 출력
    // 뺀 수 : k 
    // 나머지 수의 최대 공약수가 K의 약수가 되면 안된다.
    // 정답이 없는 경우 : -1출력
    static int N, K;
    static int[] LR;
    static int[] RL;
    static int[] gcd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        //N 입력받기
        gcd = new int[N];
        LR = new int[N];
        RL = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            gcd[i] = Integer.parseInt(st.nextToken());
            // N개의 수를 입력받음
        }
        // LtoR 만들기 - LR은 왼쪽부터 그전에 요소랑 현재의 요소를 gcd함수에 담아 그 둘중에서 최대공약수를 설정
        LR[0] = gcd[0];
        for (int i = 1; i < N; i++) {
            LR[i] = gcd(LR[i - 1], gcd[i]);
        }
        // RtoL 만들기 - RL은 맨 오른쪽부터 채워나가는 거라서, 오른쪽의 요소(i+1) 랑 현재의 요소를 gcd 함수에 담아 그 둘중에서 최대공약수를 설정한다.
        RL[N - 1] = gcd[N - 1]; // 마지막 요소
        for (int i = N - 2; i >= 0; i--) {
            RL[i] = gcd(RL[i + 1], gcd[i]);
        }
        // k 선정하기
        int max = -1;
        int maxIndex = 0;
        for (int i = 0; i < N; i++) {
            int g = 0;
            // 0
            if (i == 0)
                g = RL[1];
            else if (i == N - 1)
                g = LR[N - 2];
            else
                g = gcd(LR[i - 1], RL[i + 1]);

            if (gcd[i] % g != 0 && g > max) {
                //최대공약수는 입력받은 수의 약수가 되면 안되는 조건 추가
                max = g;
                maxIndex = i;
            }
          

        }
        if (max != 0) System.out.println(max + " " + gcd[maxIndex]);
        else System.out.println("-1");
    }

    //gcd(a,b) == gcd(b,r) == gcd(b,a%b) stop when a % b = 0
    public static int gcd(int a, int b) {
        while (b != 0) {
            //b가 0이 되면 안돼
            int r = a % b;
            //b가 a자리로 와야되고, 새로운 r이 b자리에 들어가야돼
            a = b;
            b = r;
            //b가 0이 되었으면 gcd는 a자리에 있는것
            //그래서 return a;
        }
        return a;
    }
}
