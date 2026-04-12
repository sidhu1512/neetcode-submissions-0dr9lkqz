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
        int length = 0;
        ListNode curr =  head;
        
        while(curr != null){
            length++;
            curr = curr.next;
        }

        n = length - n ;
        if(n == 0) return head.next;

        curr = head;
        ListNode prev = head;

        while(n > 0 ){
            n--;
            prev = curr;
            curr = curr.next;    
        }

        prev.next = curr.next;

        return head;
    }
}
