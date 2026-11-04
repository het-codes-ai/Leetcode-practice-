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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode p1=head;
        int n=1;
        
        while(p1.next!=null){
            n++;
            p1=p1.next;
        }
        p1=head;
        for(int i=0;i<(n/2)-1;i++){
            p1=p1.next;
        }
        p1.next=p1.next.next;
        return head;
    }
}
