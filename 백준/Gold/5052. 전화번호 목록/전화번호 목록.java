
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static class trie{
        static int childsize = 10;
        static trienode root;
        static class trienode{
            trienode child[] = new trienode[childsize];
            boolean isfinish = false;
        }
        public trie() {
            root = new trienode();
        }
        
        public void insert(String word) {
            trienode current = this.root;
            for(int i = 0 ; i < word.length() ; i++) {
                char a = word.charAt(i);
                int index = a-'0';
                if(current.child[index]==null) {
                    current.child[index] = new trienode();
                }
                current = current.child[index];
            }
            current.isfinish=true;
        }

        public boolean search(String target) {
            
            trienode current  = root;

            for(int i = 0 ; i < target.length(); i++) {
                char a = target.charAt(i);
                int index = a-'0';
                if(current.child[index]==null) {
                    return false;
                }
                //출발 가능 조건 : root가 해당 child를 가지고 있으면 포인터는 해당 child의 주소값 가르킴
                current = current.child[index];

                if(i < target.length()-1 && current.isfinish) {
                    //마지막 글자가 아닌데, isfinish일경우 : 중간에 다른 문자가 있다는것 의미
                    return false;
                }

            }
            return (current!=null)&&current.isfinish;
            // 마지막 글자이고, isfinsh일 경우 마지막 리프노드라는 것을 의미
            // 그렇다면 true 출력
        }


    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            trie trie = new trie();

            String str[] = new String[m];
            for(int i = 0 ; i < m ; i ++) {
                //str을 입력받는다.
                str[i] = br.readLine();
                trie.insert(str[i]);
                //trie에 입력받은 str 채워넣기
            }

            boolean isContiune = true;

            for(int i = 0 ; i < m ; i ++) {
                if(trie.search(str[i])) {
                    // 출발요건 : 만약 root가 해당 자식을 가지면 true출력
                    continue;
                } else {
                    isContiune =false;
                    break;
                }
            }
            //만약 iscontinue가 true면 yes 출력 , iscontinue가 false면 no 출력
            String answer = isContiune ? "YES" :"NO";
            sb.append(answer+"\n");
        }System.out.println(sb);
        // 결과출력

    }

}