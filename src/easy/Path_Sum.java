package easy;

public class Path_Sum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null) {
            return false;
        }

        return hasPathSumOfRecursion(root, sum);
    }

    private boolean hasPathSumOfRecursion(TreeNode root, int sum) {
        if(root != null && root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        if(root == null || (root.left == null && root.right == null)) {
            return false;
        }
        return hasPathSumOfRecursion(root.left, sum - root.val) || hasPathSumOfRecursion(root.right, sum - root.val);
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

    public static void main(String[] args) {
        Path_Sum solution = new Path_Sum();
        solution.hasPathSum(null, 20);
    }
}
