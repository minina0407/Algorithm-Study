import java.util.Stack;
class Solution
{ // 앞뒤로 문자열을 이어 붙인다.
    public int solution(String s)
    {
    Stack<Character>stack = new Stack();
        for(char c : s.toCharArray()){
            if(!stack.empty()&&stack.peek() == c){
                stack.pop();
                
            }
            else
            {
                stack.push(c);
            }
        }
    return stack.empty() ? 1:0;
    }
}