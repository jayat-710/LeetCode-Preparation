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
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1,n2)->(n1.val-n2.val));
        
        ListNode list = new ListNode();
        
        ListNode head=list;
        ListNode nxt =head;
        
        for(ListNode k : lists){
            ListNode temp = k;
            while(temp!=null){
                pq.add(temp);
                temp=temp.next;
                
            }
        }
        
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            nxt.next=temp;
            nxt=nxt.next;
            nxt.next=null;
            
        }
        return head.next;
    }
}