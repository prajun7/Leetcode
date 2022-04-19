/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        // stack of storage nodes
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;// previous node
        TreeNode first = null;// first wrong node
        TreeNode second = null;// second wrong node
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();

                if (first == null && pre != null && pre.val > root.val) {
                    first = pre;
                }
                if (first != null && pre.val > root.val) {
                    second = root;
                }
                pre = root;

                root = root.right;
            }
        }

        // Swap the values of two nodes
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }
}