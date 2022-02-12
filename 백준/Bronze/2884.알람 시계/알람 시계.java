

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
45분 일찍 알람 설정하기
 -
 h,m 주어짐 : 현재 상근시가 설정해놓은 시 분
 0000~23:59
 출력 : 설정해야화는 알람시간
 그럼 입력으로 주어진 시간에서 -45하면 되지(분)
 아이거전에햇던건디..
 if 문으로 케이스들 나눠서
 만약에 분을 넘어가면 시간 -1
case 나누기 :
 1) 만약에 시가 24이내이면 정상적으로 출력
  -1. 만약에 분이 59이내이면 정상적으로 출력
    -1. -45해주기
  -2. 만약에 분이 59이상이면 -59해주기
 2) 만약에 시가 24이상이면 -24해주기

 * **/
public class Main{
    public static void main(String args[]) throws IOException {
        //현재 설정 시간 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int h = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        if(h<24){
            if(m<=59){
                m-=45;
                if(m<0){
                    h--;
                    m=60+m;
                }

            }
            else
            {
                m-=59;
            }}
            else
            {

                h-=24;

        }
        if(h<0){
            h=24+h;
        }
            System.out.println(h+" "+m);

    }


}