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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null){
            return null;
        }
        
        ListNode curr=head.next;
        ListNode prev=head;
        
        if(curr==null)return prev;
        
        ListNode temp=curr.next;
        curr.next=prev;
        prev.next=swapPairs(temp);
        
        return curr;
        
    }
}