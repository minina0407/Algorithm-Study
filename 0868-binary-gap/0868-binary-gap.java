class Solution {
    public int binaryGap(int n) {
        String BString = Integer.toBinaryString(n);
        int maxLen = 0;
        int curLen = 0;
        boolean inGap = false ;

        for(int i = 0 ; i<BString.length(); i++){
            char bit = BString.charAt(i);
            if(bit == '1'){
                if(inGap){
                    curLen++;
                        maxLen = Math.max(curLen, maxLen);
                    curLen = 0 ;
                }
                 else{
                    inGap = true;
                }
            }
            else{
                if(inGap){
                          curLen++;
                }
               
            }
        }
        return maxLen;
    }
}