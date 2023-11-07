class Solution {
    //비트 연산자
    // ^ :  두 비트가 같으면 0, 다르면 1을 반환

    public int[] findArray(int[] pref) {
        
         int[] result = new int[pref.length];
          result[0] = pref[0];
        for(int i = 1 ; i<pref.length; i++){
            result[i] = pref[i] ^ pref[i-1];
        }
        return result;
    }
}