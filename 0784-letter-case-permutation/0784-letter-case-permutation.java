class Solution {
    public List<String> letterCasePermutation(String s) {
    // s의 스펠링을 upper,lower해서 만들수 있는 조합 return
        List<String> letterCaseList = new ArrayList<>();
        letterCaseList.add(s);

        for(int i = 0 ; i<s.length() ; i++){
            char ele = s.charAt(i);
            //숫자말고 문자만 변환해서 조합
            if(Character.isLetter(ele)){
                List<String> convertLetterList = new ArrayList<>();
                for(String str : letterCaseList ){
                    char upperChar = Character.toUpperCase(ele);
                    char lowerChar = Character.toLowerCase(ele);

                    convertLetterList.add(str.substring(0,i)+upperChar+str.substring(i+1));
                    convertLetterList.add(str.substring(0,i)+lowerChar+str.substring(i+1));
                }
                letterCaseList = convertLetterList;
            }

        }
        return letterCaseList;
    }
}