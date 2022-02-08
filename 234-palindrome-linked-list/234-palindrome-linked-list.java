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
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> stk = new Stack<>();
        
        
        ListNode curr = head;
        while(curr!=null){
            stk.add(curr.val);
            curr=curr.next;
        }
        
        curr=head;
        
        while(!stk.isEmpty()){
            if(curr.val!=stk.peek()){
                return false;
            }
            stk.pop();
            curr=curr.next;
            
            
        }
        
        
        return true;
    }
}