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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummy_even = new ListNode(-1);
        ListNode dummy_odd = new ListNode(-1);
        
        ListNode curr= head;
        ListNode even_tail=dummy_even;
        ListNode odd_tail=dummy_odd;
        
        int count=1;
        while(curr!=null){
            if(count%2==0){
                even_tail.next=curr;
                even_tail=curr;
                
                
            }
            else{
               odd_tail.next=curr;
                odd_tail=curr; 
                
            }
            count++;
            curr=curr.next;
        }
        
        even_tail.next=null;
        
      odd_tail.next= dummy_even.next;  
        
        return dummy_odd.next;
        
    }
}