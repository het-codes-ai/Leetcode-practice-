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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;            
        }
        ListNode p1=head;
        ListNode p2=prev;
        int maxsum=0;
        while(p2.next!=null){
            int currsum=p1.val+p2.val;
            maxsum=Math.max(maxsum,currsum);
            p1=p1.next;
            p2=p2.next;
        }
        return maxsum;
    }
}
