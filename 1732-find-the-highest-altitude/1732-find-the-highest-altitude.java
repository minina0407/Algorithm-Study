import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int curAlt = 0;
        int maxAlt = 0;
        for(int i = 0 ; i<gain.length;i++){
            curAlt+=gain[i];
            maxAlt = Math.max(curAlt,maxAlt);
        }
        return maxAlt;
    }
}

 