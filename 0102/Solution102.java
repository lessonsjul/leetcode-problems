import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int levelCount = 0;
        int levelSize = queue.size();
        List<Integer> levelValues = new ArrayList<>();

        while (!queue.isEmpty()) {
            var current = queue.poll();
            levelValues.add(current.val);
            levelCount++;
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

            if (levelCount == levelSize) {
                levelCount = 0;
                levelSize = queue.size();
                result.add(levelValues);
                levelValues = new ArrayList<>();
            }
        }


        return result;
    }
}