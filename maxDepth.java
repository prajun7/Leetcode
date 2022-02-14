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

// Using Level Order Approach
class Solution {
    public int maxDepth(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null) return 0;
        // If root is null, that is no any element, than return 0
        
        queue.offer(root);
        //offer adds the element
        //Better to use offer as it doesn't throw exception
        
        int depth = 0;
        
        while(!queue.isEmpty()){
            // At first iteration queue has root,
            // So, queue.isEmpty() will give False, but 
            // !queue.isEmpty() will have it True
            // So, the while loop will execute
            // While loop will end, when queue is empty
            // Queue will be empty when we reach to the end of the tree
            // The below if statements will not add any element to the queue
            // We are using poll to remove the element
            // So, this while loop will end
            
            int levelNum = queue.size();
            //Get the size of the queue and use for loop that many times
             
            for(int i=0; i<levelNum; i++) {  //Loop that many times
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                
                //Only after getting other corresponding elements,
                // remove that element and add it's value to the subList
                queue.poll();
            }
            
            depth++;
            
        }
        
        return depth;     
    }
}
