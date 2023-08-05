import java.util.Arrays;

class Solution {
    public boolean isBoomerang(int[][] points) {
        if (Arrays.equals(points[0], points[1]) || Arrays.equals(points[1], points[2]) || Arrays.equals(points[0], points[2])) {
            return false;
        }
        
        int[] point1 = points[0];
        int[] point2 = points[1];
        int[] point3 = points[2];
        
        int slope1 = (point2[1] - point1[1]) * (point3[0] - point2[0]);
        int slope2 = (point3[1] - point2[1]) * (point2[0] - point1[0]);

        return slope1 != slope2;
    }
}
