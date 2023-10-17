class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = BackSpace(s);
        t = BackSpace(t);

        return s.equals(t);
    }
    private String BackSpace(String s){
         StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                result.append(c);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }
}