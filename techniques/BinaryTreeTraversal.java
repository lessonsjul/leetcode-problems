import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The Binary Tree Traversal Technique is used for problems that need visiting all nodes in a tree in a specific order, such as:
 * * Inorder, Preorder, Postorder traversals
 * * Level-order (BFS) traversal
 * * Checking tree properties (height, balance, symmetry)
 * * Searching or finding values
 * * Serializing/deserializing a tree
 *
 * It ensures every node is processed systematically.
 */
public class BinaryTreeTraversal {

    public List<Integer> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        List<Integer> result = new ArrayList<>();
        var queue = new ArrayDeque<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var levelSize = queue.size();
            var currentLevel = new LinkedList<Integer>();

            for (int i = 0; i < levelSize; i++) {
                var current = queue.pop();
                currentLevel.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.addAll(currentLevel);
        }

        return result;
    }
}
