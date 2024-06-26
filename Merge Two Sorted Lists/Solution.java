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
    public class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val; 
        }
        ListNode(int val, ListNode next) {
            this.val = val; 
            this.next = next; 
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = new ListNode();
        ListNode current = first;
        ListNode next;
        
        while (list1 != null && list2 != null) {
            next = new ListNode();
            current.next = next;
            current = current.next;
            if (list1.val > list2.val) {
                next.val = list2.val;
                list2 = list2.next;
            }
            else {
                next.val = list1.val;
                list1 = list1.next;
            }
        }
        while (list1 != null && list2 == null) {
            next = new ListNode();
            current.next = next;
            current = current.next;
            next.val = list1.val;
            list1 = list1.next;
        }
        while (list1 == null && list2 != null) {
            next = new ListNode();
            current.next = next;
            current = current.next;
            next.val = list2.val;
            list2 = list2.next;
        }
        return first.next;
    }
}