import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();
        String num= sc.next();
        int sum=0;
        for(int i=0;i<count;i++){
            sum+=num.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}
