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
    public int currSum=Integer.MIN_VALUE;
    public int maxSum=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        MaxPath(root);
        return maxSum;

        
    }
    public int MaxPath(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=MaxPath(root.left);
        int right=MaxPath(root.right);
        currSum=Math.max(root.val+Math.max(left,right),root.val);
        maxSum=Math.max(maxSum,Math.max(currSum,root.val+left+right));
        return currSum;

    }
}
