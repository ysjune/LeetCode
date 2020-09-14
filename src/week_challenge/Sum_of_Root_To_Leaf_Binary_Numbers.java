package week_challenge;

public class Sum_of_Root_To_Leaf_Binary_Numbers {

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

    public int sumRootToLeaf(TreeNode root) {

        if(root != null) {
            StringBuilder sb = new StringBuilder().append(root.val);
        }





        return 1;
    }

}
