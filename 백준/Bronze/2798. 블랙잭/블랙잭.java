import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,m=0;
        int max=0;
        int sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int l=j+1;l<n;l++){
                    sum=arr[i]+arr[j]+arr[l];
                    if(max<sum && sum<=m){
                        max=sum;
                    }
                }
            }
        }
       System.out.println(max);

    }}