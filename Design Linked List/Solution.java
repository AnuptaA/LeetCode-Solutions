class MyLinkedList {
    int n;
    ListNode head, tail;

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {this.val = val; this.next = null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public MyLinkedList() {
        n = 0;
        head = null;
        tail = head;
    }
    
    public int get(int index) {
        if (index >= n) return -1;
        else if (index == n - 1) return tail.val;
        else if (index == 0) return head.val;
        int i = 0;
        ListNode current = head;
        while (i++ != index) current = current.next;
        return current.val;
    }
    
    public void addAtHead(int val) {
        if (n == 0) {
            head = new ListNode(val);
            tail = head;
        }
        else {
            ListNode node = new ListNode(val, head);
            head = node;
        }
        n++;
    }
    
    public void addAtTail(int val) {
        if (n == 0) {
            head = new ListNode(val);
            tail = head;
        }
        else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        n++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > n) return;
        else if (index == 0) {
            addAtHead(val);
            return;
        }
        else if (index == n) {
            addAtTail(val);
            return;
        }
        int i = 0;
        ListNode current = head;
        while (i++ != index - 1) current = current.next;
        current.next = new ListNode(val, current.next);
        n++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= n) return;
        if (index == 0) head = head.next;
        else {
            int i = 0;
            ListNode current = head;
            while (i++ != index - 1) current = current.next;
            if (index == n - 1) {
                current.next = null;
                tail = current;
            }
            else current.next = current.next.next;
        }
        n--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */