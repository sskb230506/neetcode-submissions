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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n==0){
            return head;
        }
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        if(n==len){
            return head.next;
        }
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            if(c==(len-n)){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;

    }
}
