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

        if(length == 1 && n == 1) return null;

        n = length - n ;

        curr = head;
        ListNode prev = head;

        while(n > 0 ){
            n--;
            prev = curr;
            curr = curr.next;
        }
        if(curr ==  head){
            head = curr.next;
        }else{
            prev.next = curr.next;
        }
        

        return head;
    }
}
