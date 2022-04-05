import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> n=new HashSet<>();
        int a;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
        n.add(sc.nextInt());
        }
        int M=sc.nextInt();
        int []m=new int[M];
        for(int i=0;i<M;i++){
            m[i]=sc.nextInt();
        }
        int []arr=new int[M];
        for(int i=0;i<M;i++){
            if(n.contains(m[i]))
                arr[i]=1;
            else
                arr[i]=0;
        }
        for(int i=0;i<M;i++){
            System.out.println(arr[i]);
        }


    }

    }
