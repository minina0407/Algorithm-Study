class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        char[] str = s.toCharArray();
        splitStr(set, str, 0);
        return max;
    }

    private int max = 0;

    private void splitStr(Set<String> set, char[] str, int index) {
        if (index == str.length) {
            max = Math.max(max, set.size());
            return;
        }

        for (int i = index + 1; i <= str.length; i++) {
         
            String substr = new String(str, index, i - index);
            if (set.contains(substr))
                continue;
            set.add(substr);
            splitStr(set, str, i);
            set.remove(substr); // 다음을 위해서 SUBSTR 삭제
        }
    }
}
