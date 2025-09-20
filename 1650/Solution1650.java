/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution1650 {
    public Node lowestCommonAncestor(Node p, Node q) {
        if (contains(p, q)) {
            return p;
        }

        if (contains(q, p)) {
            return q;
        }

        return findCommonAncestor(p, q);
    }

    private boolean contains(Node target, Node source) {
        if (target == null || source == null) {
            return false;
        }

        if (target.val == source.val || contains(target.left, source) || contains(target.right, source)) {
            return true;
        }

        return false;
    }

    private Node findCommonAncestor(Node p, Node q) {
        if (p.parent == null) {
            return p;
        }

        if (q.parent == null) {
            return q;
        }

        if (p.parent.val == q.parent.val) {
            return p.parent;
        }

        if (contains(p.parent, q)) {
            return p.parent;
        }

        if (contains(q.parent, p)) {
            return q.parent;
        }

        return findCommonAncestor(p.parent, q.parent);
    }
}