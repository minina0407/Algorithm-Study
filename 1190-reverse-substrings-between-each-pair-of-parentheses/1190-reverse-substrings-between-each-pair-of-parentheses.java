class Solution {
    public String reverseParentheses(String s) {
      Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(sb.toString());
                sb = new StringBuilder();
            } else if (c == ')') {
                // 괄호 끝나면 스택에서 문자열 꺼내서 뒤집기
                sb.reverse();
                sb.insert(0, stack.pop());
            } 
            else {
                //괄호말고 문자열 넣기 
                sb.append(c);
            }
    }
         return sb.toString();
}
}