class MinStack {
    private MinStackNode last;
    private class MinStackNode {
        int val, min;
        MinStackNode prev;
    }

    public MinStack() {
        last = null;
    }
    
    public void push(int val) {
        if (last == null) {
            last = new MinStackNode();
            last.val = val;
            last.min = val;
            last.prev = null;
        }
        else {
            MinStackNode next = new MinStackNode();
            next.val = val;
            next.min = Math.min(last.min, val);
            next.prev = last;
            last = next;
        }
    }
    
    public void pop() {
        last = last.prev;
    }
    
    public int top() {
        return last.val;
    }
    
    public int getMin() {
        return last.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */