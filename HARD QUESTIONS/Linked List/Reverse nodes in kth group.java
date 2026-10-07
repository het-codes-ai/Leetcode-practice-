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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode groupPrev=dummy;
        dummy.next=head;
        while(true){
            ListNode kth=groupPrev;
            for(int i=0;i<k;i++){
                kth=kth.next;
                if(kth==null){
                    return dummy.next;
                }
            }
            ListNode groupNext=kth.next;
            ListNode curr = groupPrev.next;
            ListNode prev = groupNext;

            while (curr != groupNext) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode oldHead = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = oldHead;
        
        }
    }
}