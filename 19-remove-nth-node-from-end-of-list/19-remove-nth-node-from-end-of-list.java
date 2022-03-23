/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    /*
    Algorithm: 
    Get the length of linkedList
    subtract the length with the given n
    loop till that point
    and skip the next value
    
    */
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
         //Edge case
        //If only one node or no node, return null
        if (head == null || head.next == null){ 
            return null;           
        }
        
        ListNode dummyHead = head;
        ListNode temp = head;
        
        //Get the length
        int count = 0;
        while(dummyHead != null){
            dummyHead = dummyHead.next;
            count++;
        }
        
        //Edge case
        //If length is equal to given n,
        //Then just move the head and return the head
        if (count == n){
            head = head.next;
            return head;
            
        }
        
        // get the loop by subtraction
        int loop = count - n ;
        
        // loop till it reaches to 1
        while (loop-- > 1){
            head = head.next;
        }
        
        // change the head.next to head.next.next
        // That is skipping the value
        head.next = head.next.next;
        return temp;
        
    }
}