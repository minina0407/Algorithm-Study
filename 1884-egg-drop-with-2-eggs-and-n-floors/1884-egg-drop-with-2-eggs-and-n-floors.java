class Solution {
    public int twoEggDrop(int n) {
       // 2 * 7 * 7 = 98
        // 2 * 6 * 8 = 96
        // 2 * 5 * 9 = 90
        // 2 * 4 * 10 = 80

        int answer = 0;
   
        // Math.ceil : 올림
        // Math.ceil( -1 하는 이유 -> 1을 더해주기 위해서)
        // Math.sqrt : 제곱근
        // Q : (1+8*n) / 2인 이유?
        //Math.sqrt(1 + 8 * n)) / 2
        // -> 1 + 8 * n = 1 + 8 * 51 = 409
        // -> Math.sqrt(409) = 20.2
        // -> 20.2 / 2 = 10.1
        // -> Math.ceil(10.1) = 11
        // -> 11
        answer = (int) Math.ceil((-1 + Math.sqrt(1 + 8 * n)) / 2);

        return answer;      
    }
}