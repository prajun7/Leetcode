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
    public TreeNode searchBST(TreeNode root, int val) {
        
        //Loop until root is not equal to null
        while(root != null){
            
            //If value is equal, return the subtree of the node,
            // Just return the node
            if (root.val == val){
                return root;
            }
            
            // If root.val is greater than the actual val, that means we need
            // to get smaller value that is need to decrease the value
            // so search on left
            if (root.val > val){
                root = root.left;
            }
            
            else{
                root = root.right;
            }
            
        }
        
        //If while loope ends, and still no element found, than just return null
        return null;
        
    }
}