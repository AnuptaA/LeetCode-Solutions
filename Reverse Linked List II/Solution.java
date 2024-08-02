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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head, next = null, reversed = null, start = head, first = head;
        int i = 0;
        if (left == 1) {
            while (i != right) {
                next = current.next;
                current.next = reversed;
                reversed = current;
                current = next;
                i++;
            }
            head.next = next;
            return reversed;
        }
        while (i++ != left - 1) {
            start = current;
            current = current.next;
        }
        ListNode end = current;
        while (i != right + 1) {
            next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
            i++;
        }
        start.next = reversed;
        end.next = next;
        return first;
    }
}