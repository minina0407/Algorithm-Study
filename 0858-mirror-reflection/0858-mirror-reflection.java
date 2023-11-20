class Solution {
    public int mirrorReflection(int p, int q) {
      while (p % 2 == 0 && q % 2 == 0) {
            p /= 2;
            q /= 2;
        }
        //p의 반절이 q의 반절보다 작으면
        // return 0
        if (p % 2 == 0 && q % 2 == 1) {
            return 2;
        }
        //p의 반절과 q의 반절이 같으면
        // return 1
        if (p % 2 == 1 && q % 2 == 1) {
            return 1;
        }
        //p의 반절이 q의 반절보다 크면
        // return 2
        if (p % 2 == 1 && q % 2 == 0) {
            return 0;
        }
        return -1;
    }
}
