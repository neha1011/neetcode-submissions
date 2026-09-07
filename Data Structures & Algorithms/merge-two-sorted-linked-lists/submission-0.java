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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
               ListNode head = new ListNode();
       ListNode curr = head;
       while(null != list1 && null != list2){
        if(list1.val < list2.val){
            curr.next = list1;
            list1 = list1.next; 
        }else {
            curr.next = list2;
            list2 = list2.next;
        }
        curr = curr.next;
       }
        if(null != list1) curr.next = list1;
        if(null != list2) curr.next = list2;
       
         
       return null != head ? head.next : null;
        
    }
}