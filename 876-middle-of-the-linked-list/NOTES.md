count = count/2;  //Divide count by 2 to get the middle element
for (int i = 0; i < count ; i ++){   //Loop till the count
cloneHead = cloneHead.next;
}
dummyHead = cloneHead;  //After the loop ends,
// point the cloneHead to the
return dummyHead;
}
}
```
​
```
​
Method 02: Tortoise Method
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
public ListNode middleNode(ListNode head) {
ListNode slow = head;
ListNode fast = head;
//Tortoise method
while(fast != null && fast.next != null){
slow = slow.next;
fast = fast.next.next;
}
return slow;
}
}
```