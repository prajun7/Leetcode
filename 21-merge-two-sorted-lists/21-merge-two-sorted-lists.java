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

/*
Striver: https://www.youtube.com/watch?v=Xb4slcp1U38
*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val > l2.val){   // l1 should hold the smallest value between l1 adn l2
            ListNode temp = l1;  // If l1 is not smaller swap them.
            l1 = l2;
            l2 = temp;
        }

        ListNode res = l1;  //res will be the node containing smallest value
        while(l1 != null && l2 != null){
            ListNode tempp = null;  

            while(l1 != null && l1.val <= l2.val){  //Loop until l1 is not equal to null,
                                     // and l1 value is smaller than l2 value
                tempp = l1;  // This will keep track of the node
               l1 = l1.next;     // Keep changing l1 node 
            }
            tempp.next = l2;   // Break the chain

            //swap
            ListNode temp = l1;  //again swap so that l1 is the smallest node.
            l1 = l2;
            l2 = temp;
        }
        return res;
    }
}