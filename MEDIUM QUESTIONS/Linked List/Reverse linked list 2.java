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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        ListNode prev=null; 
        ListNode next=null;
        dummy.next=head;
        ListNode before=dummy;
        for(int i=1;i<left;i++){
            before=before.next;
            }
        ListNode curr=before.next;
        for(int i=left;i<=right;i++){     
            next=curr.next; 
            curr.next=prev;    
            prev=curr;
            curr=next;   
        }
        ListNode leftpt=before.next;
        before.next=prev;
        leftpt.next=curr;
        return dummy.next;
    }
}