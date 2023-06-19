class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
     if(!Arrays.equals(arr1, arr2)){
         return false;
     }
     int count = 0;
     for(int i = 0 ; i < s2.length() ; i++){
     if(s1.charAt(i)!=s2.charAt(i)){
         count++; }   
     }
     if(count == 2 || count == 0 )
      return true;
     else return false;
    }
}