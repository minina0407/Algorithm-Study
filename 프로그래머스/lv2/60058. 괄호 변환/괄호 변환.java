import java.util.*;
class Solution {
    int split=0;
    public String solution(String p) {
        // 재귀함수 사용 : 올바른 괄호 체크 함수 , 균형잡인 괄호 체크 함수
     
        String answer = "";
        
        if(p.isEmpty())
            return p;  // 1.입력이 빈 문자열일 경우, 빈 문자열을 반환
        
         boolean correct = isCorrect(p);
        
        String u = p.substring(0,split);
        String v= p.substring(split,p.length());
     
          
        if(correct){
            // 올바른 괄호면 문자열 V에대해 1단계부터 다시 실행
            return u + solution(v);
        }
  
        
        answer = "(" + solution(v) + ")";
        
        for(int i=1; i<u.length()-1;i++){
            if(u.charAt(i)=='('){
                answer += ")";
                
            }
            else
            {answer += "(";}
        
    }
        return answer;
    }
    
    boolean isCorrect(String str){
        // 올바른 괄호 문자열 체크 함수
         boolean ret= true;
        Stack<Character> stack =new Stack<>();
        int left=0,right=0;
       
        for ( int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
            {left++;
                stack.push('(');
            }
            else
            {  right++;
                if(stack.isEmpty())
                {  
                    ret = false;
                }
                else
                {stack.pop();}
            }
    
            
            if(left== right){
                    split = i+1;
                    return ret;
                }
        }
            
            return true;
        }
    
    
        
    }
