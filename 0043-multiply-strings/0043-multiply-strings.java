// 두 개의 문자열 num1, num2를 입력받아서 두 수를 곱한 결과를 문자열 형태로 반환하는 함수
class Solution {
public String multiply(String num1, String num2) {

    int m = num1.length(); // 첫 번째 수의 자릿수
    int n = num2.length(); // 두 번째 수의 자릿수

    // 기본 조건
    if (m == 0 || n == 0 || "0".equals(num1) || "0".equals(num2)) {
        return "0"; // 둘 중 하나가 0이거나, 둘 다 0이면 0을 반환
    }
    if ("1".equals(num1)) {
        return num2; // num1이 1이면 num2를 반환
    }
    if ("1".equals(num2)) {
        return num1; // num2가 1이면 num1을 반환
    }

    // 결과는 M + N 자리수 이하여야 함.
    // 예를 들어, 99 * 99 = 9801 (결과의 자리수는 4)
    int[] result = new int[m + n]; // 결과 배열 초기화

    for (int i = m - 1; i >= 0; i--) { // 첫 번째 수의 뒷자리부터
        for (int j = n - 1; j >= 0; j--) { // 두 번째 수의 뒷자리부터
            int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
            // 두 자리수를 곱함
            
            // 이전 결과 값을 현재 곱셈 결과에 더함
            product += result[i + j + 1];

            // 결과 배열에 현재 곱셈 결과 값을 추가함
            result[i + j + 1] = product % 10;
            result[i + j] += product / 10;
        }
    }

    // 결과 문자열 생성
    StringBuilder sb = new StringBuilder();
    for (int r : result) {
        // 선행 0은 무시함
        if (sb.length() == 0 && r == 0) {
            continue;
        }
        sb.append(r);
    }

    return sb.toString(); // 결과 문자열 반환
}
}