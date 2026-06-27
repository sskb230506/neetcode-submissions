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
    int maxCount=0;
    public int diameterOfBinaryTree(TreeNode root) {
      max(root);
      return maxCount== 0 ? 0 :maxCount-1;
        
    }
    public int max(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=max(root.left);
        int right=max(root.right);
        maxCount=Math.max(maxCount,Math.max(1+Math.max(left,right),left+1+right));
        return 1+Math.max(left,right);
    }
}
