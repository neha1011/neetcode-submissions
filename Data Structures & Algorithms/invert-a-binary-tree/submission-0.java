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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return null;
        if(root.left != null & root.right != null) {
        TreeNode node = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = node;
        }else if(root.left != null){
            root.right = invertTree(root.left);
            root.left = null;
        }else if(root.right != null){
             root.left = invertTree(root.right);
             root.right = null;
        }else {
            return root;
        }
        return root;
    }
}
