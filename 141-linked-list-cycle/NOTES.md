```
Method 01: Using HashMap
Store the node not the value,
Value could be same, so we need to store the actual node
/**
* Definition for singly-linked list.
* class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) {
*         val = x;
*         next = null;
*     }
* }
*/
public class Solution {
public boolean hasCycle(ListNode head) {
HashMap<ListNode,Integer> hashmap = new HashMap<>();
while(head!=null)
{
if(hashmap.containsKey(head))
return true;
else
hashmap.put(head,1);