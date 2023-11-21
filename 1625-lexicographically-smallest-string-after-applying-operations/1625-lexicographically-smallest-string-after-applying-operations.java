class Solution {
    Set<String> set;
    String smallest;

    public String findLexSmallestString(String s, int a, int b) {
        set = new HashSet<>();
        smallest = s;
        String answer = "";
        dfs(s,a, b);

        return smallest;
    }
    private void dfs(String s , int a , int b) {
        if(set.contains(s)) {
            return;
        }
        if(s.compareTo(smallest) < 0) {
            smallest = s;
        }
        set.add(s);
        dfs(addString(s,a),a,b);
        dfs(rotatedString(s,b),a,b);

    }
    private String rotatedString(String s, int b){
        s = s.substring(s.length() - b) + s.substring(0, s.length() - b);
        return s;
    }
    private String addString(String s, int a){
        StringBuilder sb = new StringBuilder(s);
        // a만큼 +
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                // 홀수 인덱스에 a만큼 +
                sb.setCharAt(i, (char) ((sb.charAt(i) - '0' + a) % 10 + '0'));
            }
        }
        return sb.toString();
    }
 
}