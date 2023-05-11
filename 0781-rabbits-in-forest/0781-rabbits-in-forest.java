class Solution {
    public int numRabbits(int[] answers) {
        /*
        토끼의 수를 알 수 없는 숲이 있습니다. 
        우리는 n마리의 토끼에게 "당신과 같은 색을 가진 토끼가 몇 마리나 됩니까?"라고 물었고,
        정수 배열로 답을 모았습니다. 여기서 [i]가 토끼의 답입니다.

배열 답변이 주어지면 포리스트에 있을 수 있는 최소 토끼 수를 반환합니다.
        */
        int count = 0; 
        HashMap<Integer,Integer> map = new HashMap<>();
     
        for(int ans : answers){
         
         if(map.getOrDefault(ans,ans)==ans){
                count+=ans+1;
                map.put(ans,0);
            }
            else{
                map.put(ans,map.get(ans)+1);
            }
        
        }
    
        return count;
    }
}