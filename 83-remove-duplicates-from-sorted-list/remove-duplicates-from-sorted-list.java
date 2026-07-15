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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode nodeBefore = head;
        ListNode traverse = head.next;

        while (traverse != null) {
           if (nodeBefore.val == traverse.val) {
             nodeBefore.next = traverse.next;
             traverse = traverse.next;
           } else {
            nodeBefore = traverse;
            traverse = traverse.next;
           }
        }
          return head;
    }
}