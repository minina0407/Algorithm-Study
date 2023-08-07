class Solution {
    public int strStr(String haystack, String needle) {
        
        int idx = 0;
        // sub string의 인덱스 찾기
        if(haystack.contains(needle)){
            // haystack이 needle을 포함한다면,
            idx = haystack.indexOf(needle);
        }
        else{
            return -1;
        }
        return idx;
    }
}