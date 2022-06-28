import java.util.*;

class Solution {

    boolean[][] isVisited;
    // 상하좌우 
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        // 특정 위치를 기준으로 인접한 노드를 모두 방문하며,
        // 한번 방문했던 노드는 방문 이력을 저장해가면서, 다음 노드들로 넘어가 전체를 검색
        int answer = 0;
        int n = maps.length;
        int m  = maps[0].length;
        isVisited = new boolean[n][m];
        // 인접한 노드를 모두 큐에 넣고, 인접한 노드를 모두 큐에 넣었을 때, 꺼내면서 방문했던 노드인지 배열에 기록
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0,0,1));

        while(!queue.isEmpty()){
            Node node = queue.poll();

            if(node.x == n-1 && node.y == m-1){
                // 캐릭터가 상대팀 위치 진영 위치에 있는 경우
                // count 수 출력 
                answer = node.count;
                return answer ; 
            }

            for(int i = 0; i < 4; i++){
                // 상화좌우 4방향 
                // cx와 cy는 현재 위치 
                int cx = node.x + dx[i];
                int cy = node.y + dy[i];
                
                //  다음 위치의 좌표가 범위 내에 존재하지 않거나, 방문한 경우 무시
                if(cx<0 || cy < 0 || cx >= n || cy >= m || isVisited[cx][cy])
                    continue;
                
                // 다음 좌표가 0인 경우 무시
                if(maps[cx][cy]==0)
                    continue;
            
               // 방문하지 않은 좌표이면서, maps[n][m]의 값이 1인 곳으로 가면서 answer  count ++; 
                isVisited[cx][cy] = true;
                int count = node.count + 1;
                
                // 다음 위치의 좌표와 count 수 queue에 저장
                queue.add(new Node(cx,cy,count));

            }

        }
        
         return answer == 0 ? -1 : answer;
    }

    class Node{
        int x , y , count;
        public Node(int x, int y, int count){
            this.x= x;
            this.y = y;
            this.count = count;
        }
    }

}