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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int pass=0;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+pass;
            int res=sum%10;
            pass=sum/10;
            ListNode curr= new ListNode(res);
            temp.next=curr;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;

        }
        while(l1!=null){
            int sum=l1.val+pass;
            int res=sum%10;
            pass=sum/10;
            ListNode curr=new ListNode(res);
            temp.next=curr;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+pass;
            int res=sum%10;
            pass=sum/10;
            ListNode curr=new ListNode(res);
            temp.next=curr;
            temp=temp.next;
            l2=l2.next;
        }
        if(pass!=0){
            ListNode curr=new ListNode(pass);
            temp.next=curr;
        }
        return dummy.next;
        
    }
}
