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
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
        ListNode curr= null;
        ListNode fast =head;
        
        while(fast!=null){ 
           
            curr= fast;
            fast=fast.next;
            curr.next=prev; prev =curr;
           
        }
        
        head=curr;
        
        return head;
    }
}