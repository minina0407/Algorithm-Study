class Solution {
    public List<String> simplifiedFractions(int n) {
        // 분자
        int[] molecule = new int[n + 1];
        // 분모
        int[] denominator = new int[n + 1];
        Set<Double> set = new HashSet<>();
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            molecule[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            denominator[i] = i;
        }
     
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (j < i && set.add((double) molecule[j] / denominator[i])) {
                    answer.add(molecule[j] + "/" + denominator[i]);
                }
            
            }
        }
        return answer;
    }
}