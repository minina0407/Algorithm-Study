class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        
        // s 문자열
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stackS.push(c);
            } 
          else  if (!stackS.isEmpty()) {
                stackS.pop();
            }
        }
        
        // t 문자열
        for (char c : t.toCharArray()) {
            if (c != '#') {
                stackT.push(c);
            } 
        else if (!stackT.isEmpty()) {
                stackT.pop();
            }
        }
        
        // 두 문자열 비교
        if (stackS.size() != stackT.size()) {
            return false;
        }
        while (!stackS.isEmpty()) {
           // stack에서 pop하며 원소가 같으면 true리턴, 다르면 false리턴
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }
        return true;
    }
}
