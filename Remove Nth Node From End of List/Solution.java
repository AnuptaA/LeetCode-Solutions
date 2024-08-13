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
        int sz = 0;
        ListNode current = head, next = null;
        while (current != null) {
            sz++;
            current = current.next;
        }
        if (n == sz) return head.next;
        current = head;
        int i = sz - n - 1;
        while (i-- != 0) current = current.next;
        next = current.next == null ? null : current.next.next;
        current.next = next;
        return head;
    }
}