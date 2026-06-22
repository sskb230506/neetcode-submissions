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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans= new ListNode(0);
        ListNode temp = ans;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode res=lists[i];
            while(res!=null){
                list.add(res.val);
                res=res.next; 
            }

        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ListNode curr=new ListNode(list.get(i));
            temp.next=curr;
            temp=temp.next;


        }
        return ans.next;


    }
}
