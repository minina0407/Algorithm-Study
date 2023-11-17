/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
          if(root == null){
                // Q: root가 null이면 왜 새로운 노드 생성하지?
                // A: root가 null이면 새로운 노드를 생성해서 리턴해야되니까.
                root = new TreeNode(val);
                return root;
            }
            if(root.val > val){
                // root의 값이 입력된 val보다 크다면
                // 입력된 val은 root의 왼쪽에 들어가야한다.
                root.left= insertIntoBST(root.left, val);
            }
            if(root.val < val){
                // root의 값이 입력된 val보다 작다면
                // 입력된 val은 root의 오른쪽에 들어가야한다.
                root.right= insertIntoBST(root.right, val);
            }
            return root;
    }
}