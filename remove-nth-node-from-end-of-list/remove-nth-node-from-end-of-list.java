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
       
        ListNode curr1=head;
        
        ListNode curr2=head;   ListNode prev= head;
        int i=1;
        while(i!=n){
          curr2=curr2.next;
            i++;
        }
     
        
        while(curr2.next!=null){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        
        if(curr1==head){
            head=head.next;
        }
        else{
        
        while(prev.next!=curr1){
            prev=prev.next;
        }
        
        prev.next=curr1.next;
        }
        return head;
    }
}