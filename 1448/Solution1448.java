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
class Solution1448 {
    public int goodNodes(TreeNode root) {
        return goodNodes(root.val, root);
    }

    private int goodNodes(int prev, TreeNode node) {
        var calc = prev <= node.val ? 1 : 0;

        if (node.left != null) {
            calc += goodNodes(Math.max(node.val, prev), node.left);
        }

        if (node.right != null) {
            calc += goodNodes(Math.max(node.val, prev), node.right);
        }

        return calc;
    }

}