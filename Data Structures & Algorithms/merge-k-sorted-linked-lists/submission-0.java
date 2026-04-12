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

        ListNode dummy = new ListNode(0);
        List<Integer> arr =  new ArrayList<>();

        for(ListNode lst: lists){

            ListNode curr = lst;
            while(curr != null){
                arr.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(arr);

        ListNode node = dummy;

        for(Integer n: arr){
            node.next = new ListNode(n);
            node = node.next;
        }

        return dummy.next;

    }
}
