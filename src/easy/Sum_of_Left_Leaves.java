package easy;

public class Sum_of_Left_Leaves {

    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null) {
            return 0;
        }
        return sum(root, true);
    }

    private int sum(final TreeNode root, final boolean isRight) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null && !isRight) {
            return root.val;
        }
        int leftSum = sum(root.left, false);
        int rightSum = sum(root.right, true);
        return leftSum + rightSum;
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

    }
}
