class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
     List<Integer> keys = new ArrayList<>();

        boolean isVisitedAll = false;

        //dfs 로 하고시펑
        
       isVisitedAll =  dfs(rooms, keys, 0);
        
        if(keys.size() == rooms.size()){
            isVisitedAll = true;
        }
        

        
        return isVisitedAll;
    }
    private boolean dfs(List<List<Integer>> rooms, List<Integer> keys, int roomNum){
        //만약 roomNum이 이미 방문한 방이라면 true 출력
        if(keys.contains(roomNum)){
            return true;
        }
        
        // 만약 roomNum이 방문한 방이 아니라면
        // 방문한 방으로 추가
        keys.add(roomNum);
        // 방문한 방의 열쇠를 가져온다.
        List<Integer> room = rooms.get(roomNum);
        // 방문한 방의 열쇠를 가져와서
        // 열쇠가 없으면 false
        if(room.size() == 0){
            return false;
        }
        // 열쇠가 있으면
        // 열쇠를 가져와서
        // 열쇠로 방문한 방을 방문한다.
        for(int i = 0 ; i<room.size() ; i++){
            dfs(rooms, keys, room.get(i));
        }
        
        return false;
    }
}