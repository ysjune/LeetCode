package easy;

import java.util.PriorityQueue;

public class Invert_Binary_Tree {

    /**
     *
     * Invert a binary tree.
     *
     * Example:
     * Input:
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     *
     * Output:
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     *
     */

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        if(root != null) {
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        return new TreeNode(root.val, invertTree(root.left), invertTree(root.right));

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
