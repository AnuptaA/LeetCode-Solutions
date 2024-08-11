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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0, i = 0, target;
        ListNode current = head, tail = new ListNode(), newHead;
        while (current != null) {
            current = current.next;
            n++;
        }
        if (k == 0 || head == null || n - k % n == n) return head;
        target = n - k % n;

        current = head;
        while (i++ != target) {
            tail = current;
            current = current.next;
        }

        newHead = current;
        while (current != null && current.next != null) current = current.next;
        tail.next = null;
        current.next = head;
        
        return newHead;
    }
}