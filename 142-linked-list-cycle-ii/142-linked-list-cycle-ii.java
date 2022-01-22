/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        ListNode start= head;
        
        while(start!=null){
            if(set.contains(start))return start;
            
            set.add(start);
            start=start.next;
        }
        
        return null;
    }
}