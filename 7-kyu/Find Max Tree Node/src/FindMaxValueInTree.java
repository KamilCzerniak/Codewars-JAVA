public class FindMaxValueInTree {
    static int findMax(TreeNode  root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = root.value;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        max = Math.max(max, leftMax);
        max = Math.max(max, rightMax);
        return max;
    }
}
