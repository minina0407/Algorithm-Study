class Solution {
    public boolean isPerfectSquare(int num) {
        
        double root = Math.pow(num, 0.5);
        int answer = (int)root;
        if( root== answer ){
            System.out.println(root);
            return true;
        }
        return false;
    }
}