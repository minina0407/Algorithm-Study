class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right =  matrix.length * matrix[0].length -1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            // 중간 위치의 행열 구하기
            int midVal = matrix[mid/matrix[0].length][mid%matrix[0].length];
            
            if(midVal == target) return true;
            else if(midVal < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return false;
    }
}