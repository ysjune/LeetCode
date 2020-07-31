package easy;

public class Diameter_of_Binary_Tree {

    /**
     *
     * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
     *
     * Example:
     * Given a binary tree
     *           1
     *          / \
     *         2   3
     *        / \
     *       4   5
     * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
     *
     * Note: The length of path between two nodes is represented by the number of edges between them.
     *
     */


//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root == null) {
//            return 0;
//        }
//        int includeRoot = depth(root.left) + depth(root.right);
//        return Math.max(includeRoot, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
//
//    }
//
//    public int depth(TreeNode node) {
//        if(node == null) {
//            return 0;
//        }
//        return Math.max(depth(node.left), depth(node.right)) + 1;
//    }

    int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    private int dfs(final TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftCount = 1 + dfs(root.left);
        int rightCount = 1 + dfs(root.right);
        max = Math.max(max, leftCount+rightCount);
        return Math.max(leftCount, rightCount);
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
