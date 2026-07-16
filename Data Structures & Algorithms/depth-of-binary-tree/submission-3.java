class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int count = 0;

        if (root.left != null) {
            count = 1 + maxDepth(root.left);
        }

        if (root.right != null) {
            count = Math.max(count, 1 + maxDepth(root.right));
        }

        return count;
    }
}