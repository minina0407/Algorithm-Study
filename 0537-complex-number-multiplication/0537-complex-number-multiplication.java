class Solution {
    public String complexNumberMultiply(String num1, String num2) {
     String realNum1 = "";
    String realNum2 = "";
    String imaginaryNum1 = "";
    String imaginaryNum2 = "";
    for(int i = 0 ; i<num1.length()  ; i++){
        realNum1 = num1.substring(0, num1.indexOf("+"));
        imaginaryNum1 = num1.substring(num1.indexOf("+")+1, num1.indexOf("i"));
    }

    for(int i = 0 ; i<num2.length()  ; i++){
         realNum2 = num2.substring(0, num2.indexOf("+"));
         imaginaryNum2 = num2.substring(num2.indexOf("+")+1, num2.indexOf("i"));
    }
    
    int realNum1Int = Integer.parseInt(realNum1);
    int realNum2Int = Integer.parseInt(realNum2);
    int imaginaryNum1Int = Integer.parseInt(imaginaryNum1);
    int imaginaryNum2Int = Integer.parseInt(imaginaryNum2);
   int realNum = realNum1Int * realNum2Int - imaginaryNum1Int * imaginaryNum2Int;
   int realImaginaryNum =realNum1Int * imaginaryNum2Int + realNum2Int * imaginaryNum1Int;
    String answer = "";
    answer = realNum + "+" + realImaginaryNum + "i";
        return answer;
    }
}