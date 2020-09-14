package easy;

public class Range_Sum_of_BST {

    int sum = 0;
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

    public int rangeSumBST(TreeNode root, int L, int R) {

        dfs(root, L, R);
        return sum;
    }

    private void dfs(final TreeNode root, final int L, final int R) {
        if(root != null) {
            if(root.val >= L && root.val <= R) {
                sum += root.val;
            }
            if(root.val > L) {
                dfs(root.left, L, R);
            }
            if(root.val < R) {
                dfs(root.right, L, R);
            }
        }
    }
}
