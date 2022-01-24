import java.util.Scanner;

public class Main{

    private static void Binary(long N) {
        if(N<=1)
        {  System.out.print(N);
            return;}
         Binary(N/2);
        System.out.print(N%2);
    }
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        Binary(N);
        scan.close();
    }
    }




