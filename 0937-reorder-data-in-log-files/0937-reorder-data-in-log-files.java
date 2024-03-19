class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();    
    for(String log : logs){
        // 숫자 로그와 문자 로그를 분류
        // 만약 log의 두번째가 숫자면 -> 숫자로그 
    if (Character.isDigit(log.split(" ")[1].charAt(0))) {
        digitLogs.add(log);
    }
    if (Character.isLetter(log.split(" ")[1].charAt(0))) {    
        letterLogs.add(log);
    }
  
}
       // 문자로그 정렬
        letterLogs.sort(new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);
                
                String content1 = split1[1];
                String content2 = split2[1];
                
                // 내용이 다른 경우, 내용을 기준으로 정렬
                int cmp = content1.compareTo(content2);
                if (cmp != 0) {
                    return cmp;
                }
                
                // 내용이 같으면 식별자를 기준으로 정렬
                return split1[0].compareTo(split2[0]);
            }
        });
       
        letterLogs.addAll(digitLogs);


        return letterLogs.toArray(new String[0]);
    }
}