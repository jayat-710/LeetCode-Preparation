/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        int size1=0;
        int size2=0;
        
        ListNode temp =  headA;
        
        while(temp!=null){
            temp=temp.next;
            size1++;
        }
        
        ListNode curr =  headB;
        
        while(curr!=null){
            curr=curr.next;
            size2++;
        }
        
        temp =  headA;
        curr =  headB;
        
        if(size2>size1){
            while(size2!=size1){
                curr=curr.next;
                size2--;
            }
        }
        else{
             while(size2!=size1){
                temp=temp.next;
                size1--;
            }
        }
        
        while(temp!=null){
            if(temp==curr){
                return temp;
            }
            temp=temp.next;
            curr=curr.next;
            
            
        }
       return null; 
    }
}