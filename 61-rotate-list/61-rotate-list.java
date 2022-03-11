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
    public ListNode rotateRight(ListNode head, int k) {
        
         if(head == null || k == 0) {
        return head;
    }
        
        ListNode dummyHead = head;
       
        //Starting count from 1, beacuse we want the length of the linkList in the 1 index.
        int count = 1;
        while (dummyHead.next != null){
            dummyHead = dummyHead.next;
            count++;
        }
        
        // System.out.println(count);
        
        // Connect the end of the listNode with its head
        // This creates circular linkList, which makes us easy to rotate
        dummyHead.next = head;
             
        ListNode temp = dummyHead;
        
        // Using modulo, to remove the number of time that we have to rotate linkList
        // If length is 6, than if k = 12,18,24 that is all the multiple of 6.
        // than also we only have to rotate k % 6 times to get the result
         k = k % count;
        
        //Subtracting as we are looping from the front
        k = count - k;
        
        //Keep looping until k is greater than 0,
        while (k > 0){
            temp = temp.next;
            k--;
        }
        
        // save the listNode to return at the end
        ListNode save = temp.next ;
        
        // make the next of the list to null
        temp.next = null;
        
        //return the saved linklist
        return save;
        
        
        
    }
}