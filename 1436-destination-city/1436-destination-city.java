class Solution {
    public String destCity(List<List<String>> paths) {
        //그럼 마지막 종착지는 out이 없어야해
        String[][] arrPaths = new String[paths.size()][];
        HashMap<String, Integer> in = new HashMap<>();
        HashMap<String, Integer> out = new HashMap<>();

        for (int i = 0; i < paths.size(); i++) {
            String inKey = paths.get(i).get(0);
            String outKey = paths.get(i).get(1);
            in.put(inKey, in.getOrDefault(inKey, 0) + 1);
            out.put(outKey, out.getOrDefault(outKey, 0) + 1);
        }
        for (String key : out.keySet()) { // out HashMap에 대해 반복문 수행
            if (!in.containsKey(key)) { // 만약 out에 있는 요소가 in에있는 요소에 포함되지 않으면 해당 키 return
                return key;
            }
        }

        return "";
    }
}