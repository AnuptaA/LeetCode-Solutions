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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode();
        ListNode current = first;
        int sum;
        int carry = 0;

        while (l1 != null && l2 != null) {
            current.next = new ListNode();
            current = current.next;
            sum = l1.val + l2.val + carry;
            current.val = sum % 10;
            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null && l2 == null) {
            current.next = new ListNode();
            current = current.next;
            sum = l1.val + carry;
            current.val = sum % 10;
            carry = sum / 10;

            l1 = l1.next;
        }

        while (l1 == null && l2 != null) {
            current.next = new ListNode();
            current = current.next;
            sum = l2.val + carry;
            current.val = sum % 10;
            carry = sum / 10;

            l2 = l2.next;
        }

        if (carry == 1) {
            current.next = new ListNode();
            current = current.next;
            current.val = carry;
        }

        return first.next;
    }
}