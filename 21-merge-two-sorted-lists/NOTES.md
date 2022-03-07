```
/*
Striver: https://www.youtube.com/watch?v=Xb4slcp1U38
*/
​
Method 01: Using Extra space
​
/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
class Solution {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
ListNode node = new ListNode();  //move node as we add value to it.
ListNode head = node;  //head will be pointing to node
​
while (l1 != null || l2 != null) {
// Take node for L1 List
if (l2 == null || (l1 != null && l1.val < l2.val)) {
node.next = l1; //Store l1 in node
l1 = l1.next;   //Move l1 to next node
}
​