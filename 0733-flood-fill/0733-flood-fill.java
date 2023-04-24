class Solution {
    /*
    영상은 m x n 정수 그리드 영상으로 표시되며, 여기서 영상 [i][j]는 영상의 픽셀 값을 나타냅니다.

    또한 세 개의 정수 sr, sc 및 색상이 제공됩니다. 픽셀 이미지[sr][sc]부터 이미지에 플러드 채우기를 수행해야 합니다.

    플러드 채우기를 수행하려면 시작 픽셀과 시작 픽셀과 동일한 색상의 시작 픽셀에 4방향으로 연결된 픽셀, 
    해당 픽셀에 4방향으로 연결된 픽셀(동일한 색상) 등을 고려합니다. 위    에서 언급한 모든 픽셀의 색상을 색상으로 바꿉니다.

    플러드 채우기를 수행한 후 수정된 이미지를 반환합니다
    위치(sr, sc) = (1, 1)(즉, 빨간색 픽셀)이 있는 영상의 중앙에서
    시작 픽셀(즉, 파란색 픽셀)과 동일한 색상의 경로로 연결된 모든 픽셀이 새 색상으로 색상이 지정됩니다.
하단 모서리는 시작 픽셀에 4방향으로 연결되어 있지 않기 때문에 2 색상이 아닙니다.
    */
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // 네 방향
         boolean[][] visited = new boolean[image.length][image[0].length];
        if(image[sr][sc] == color){
            return image; // 이미 같을 경우 그대로 반환하면된다.
        }
       newFloodFill(image,sr,sc,image[sr][sc],color,visited);
        return image;
    }
    private void newFloodFill(int[][] image,int i,int j,int originalColor, int color,boolean[][] visited){
        if(i<0 || i>=image.length || j< 0 ||j>=image[0].length || visited[i][j] || image[i][j] != originalColor ){
            //범위 벗어난 경우
            return;
        }
      
            image[i][j] = color;
            visited[i][j] = true;
        //재귀 함수 활용하여 모든 원소들의 네 방향 원소 바꾸기
          newFloodFill(image,i+1,j,originalColor,color,visited);
          newFloodFill(image,i-1,j,originalColor,color,visited);
          newFloodFill(image,i,j-1,originalColor,color,visited);
          newFloodFill(image,i,j+1,originalColor,color,visited); 
        }

    }
