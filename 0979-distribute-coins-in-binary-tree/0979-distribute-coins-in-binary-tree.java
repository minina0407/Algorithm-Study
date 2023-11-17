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
    public int distributeCoins(TreeNode root) {

        int[] ans = new int[1];
        dfs(root, ans);
        return ans[0];

    }
    private int dfs(TreeNode root, int[] ans){
        if(root == null) return 0;
        // Q : 왜 dfs
        // A : 리프노드부터 시작해서 부모노드로 올라가면서 계산하기 위해서
        // 왜 left, right 나눠서 dfs 하는지
        // 왼쪽과 오른 쪽 서브트리를 나눠서 계산하기 위해서
        int left = dfs(root.left, ans);
        int right = dfs(root.right, ans);
        // 왜 ans[0]을 선언
        // ans[0]을 선언한 이유는 dfs를 통해 리프노드까지 내려갔다가 다시 올라오면서 계산하기 위해서
        // 왜 절댓값을 두개 더하는지
        // 왼쪽과 오른쪽 서브트리를 나눠서 계산하기 때문에
        // 왼쪽과 오른쪽 서브트리의 절댓값을 더해줘야 한다.
        // 왜 root.val + left + right - 1을 리턴하는지
        // root.val + left + right - 1 : root에 필요한 코인의 개수
        ans[0] += Math.abs(left) + Math.abs(right);
         return root.val + left + right - 1;
    }

}