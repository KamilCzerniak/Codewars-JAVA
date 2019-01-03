public class Solution {


    static int maxSum(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return Math.max(maxSum(root.left), maxSum(root.right)) + root.value;
    }
}
