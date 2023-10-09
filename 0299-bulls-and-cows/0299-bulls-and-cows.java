class Solution {
    public String getHint(String secret, String guess) {
       // x = bulls의 수, y = cows의수
       // buills 올바른위치,올바른 숫자,
       // cows : 숫자는맞지만, 위치 올바르지않아
       
        int bulls = 0;
        int cows = 0;
        //secret 글자 수 빈도 배열
        int[] secretFreq = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)){
                // buills 올바른위치,올바른 숫자,
                bulls++;
            } else{
             // 그렇지 않으면 해당 숫자의 빈도수 증가
                secretFreq[secret.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < guess.length(); i++) {
        // 위치는 안맞지만, secret에 포함되어있는 글자면 cows cnt 증가 
            if(secretFreq[guess.charAt(i) - '0'] > 0 && secret.charAt(i) != guess.charAt(i)) {
                cows++;
                // 사용한 숫자이므로 횟수 감소 
                secretFreq[guess.charAt(i) - '0']--;
            }
        }
            return bulls + "A" + cows + "B";
    }


    }
