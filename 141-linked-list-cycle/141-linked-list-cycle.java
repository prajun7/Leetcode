/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        /*
        Algorithm:
        Use two pinters, fast and slow
        loop until fast  or fast.next reaches null 
        return true if fast == slow
        else return fasle
        */
         if (head == null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow ){
                return true;
            }   
        }
        return false;   
    }
}