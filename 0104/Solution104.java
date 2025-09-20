/**
 * Definition for a binary tree node.

 */
class Solution104 {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode node, int count) {
        if (node == null) {
            return count;
        } else {
            count = count + 1;
            int left = maxDepth(node.left, count);
            int right = maxDepth(node.right, count);
            return Math.max(left, right);
        }
    }
}

