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
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode node : lists) {
            while (node != null) {
                pq.add(node.val);
                node = node.next;
            }
        }
        ListNode out = new ListNode();
        ListNode current = out;
        while (!pq.isEmpty()) {
            current.next = new ListNode(pq.poll());
            current = current.next;
        }
        return out.next;
    }
}