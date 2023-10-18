class Solution {
    public boolean checkRecord(String s) {
        // 2일 미만 A, 
        // 3일 이상 L 한적 없는 경우 -> 출석상
        int aCnt = 0 ;
        int lCnt = 0;
        int pCnt = 0;
        for(char c : s.toCharArray()){
            if(c == 'A')
            {aCnt ++;}
        }
        for(int i = 0 ; i < s.length() -2 ; i++){
            if(s.charAt(i)== 'L' && s.charAt(i+1) =='L' && s.charAt(i+2) =='L' ){return false;}
        }
        return aCnt< 2 ; 
    }
}