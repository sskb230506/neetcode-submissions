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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(second!=null){
            ListNode next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        ListNode temp=head;
        ListNode temp1=prev;
        while(temp1!=null){
            ListNode curr=temp.next;
            ListNode curr1=temp1.next;
            temp.next=temp1;
            temp1.next=curr;
            temp=curr;
            temp1=curr1;
        }
        
    }
}
