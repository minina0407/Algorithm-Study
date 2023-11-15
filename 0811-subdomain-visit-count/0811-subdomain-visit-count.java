class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        // 1.조합 할 수 있는 도메인 구하기
        // 2. HashMap이용해서 구한 도메인의 등장 횟수 저장하기
        // 900 google.mail.com , 
        // 여기서 만들 수 있는게 ,
        // google.mail.com 900 / mail.com 900 / com 900
        //  50 yahoo.com ,
        // yahoo.com 50 / com 50

        HashMap<String, Integer> counts = new HashMap<>();
        for(String domain : cpdomains){
            // times 추출 
            String[] cpinfo = domain.split("\\s+");
            // .으로 split된 단어들 추출 
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.parseInt(cpinfo[0]);
            
            String cur = "";

           
            for(int i = frags.length - 1; i >= 0; --i) {
                  //최고 도메인이라면 "" 을 붙이고, 아니라면 .붙이기 
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                 // 만들어진 애들 횟수도 같이 저장 
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }

        List<String> ans = new ArrayList<>();
        for(String dom: counts.keySet())
            ans.add("" + counts.get(dom) + " " + dom);
        return ans;
    }
}
