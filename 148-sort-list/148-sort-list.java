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
    public ListNode sortList(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        ArrayList<Integer> nodeValue = new ArrayList<Integer>();
        
        while (head != null){
            nodeValue.add(head.val);
            head = head.next;
        }
        
        Collections.sort(nodeValue);
        
        for (int i = 0; i < nodeValue.size() ; i++){
            //System.out.println(nodeValue.get(i));
            ans.next = new ListNode(nodeValue.get(i));
            ans = ans.next;
        }
        
        return dummy.next;
        
        
    }
}