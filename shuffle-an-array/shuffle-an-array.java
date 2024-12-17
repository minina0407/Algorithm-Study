class Solution {
     private int[] original; 
     private int[] array; 
    
    public Solution(int[] nums) {
        original = nums.clone();
        array = nums.clone(); // shuffle 메서드를 위해 nums의 복사본을 생성
 
    }
    
    public int[] reset() {
      array = original.clone(); // original 배열을 다시 복사하여 reset 
        return array;
    }
    
    public int[] shuffle() {
         int n = array.length;
    for (int i = 0; i < n; i++) {
    int j = i + (int) (Math.random() * (n - i)); 
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
        }  
        return array; 
    }
}
