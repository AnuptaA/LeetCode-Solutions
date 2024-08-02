class Solution {
    public String simplifyPath(String path) {
        int i = 0;
        String file, popped, res;
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>(), order = new Stack<>();
        while (i < path.length()) {
            char c = path.charAt(i);
            if (c == '/') {
                file = sb.toString();
                if (file.equals("/..")) {
                    if (!stack.isEmpty()) popped = stack.pop();
                }
                else {
                    if (!file.equals("/.") && file.length() != 0 && !file.equals("/")) {
                        stack.push(file);
                    } 
                }
                sb = new StringBuilder();
            }
            sb.append(c);
            i++;
        }
        file = sb.toString();
        if (file.equals("/..")) {
            if (!stack.isEmpty()) popped = stack.pop();
        }
        else {
            if (!file.equals("/.") && file.length() != 0 && !file.equals("/")) {
                stack.push(file);
            } 
        }
        sb = new StringBuilder();
        while (!stack.isEmpty()) order.push(stack.pop());
        while (!order.isEmpty()) sb.append(order.pop());
        res = sb.toString().equals("") ? "/" : sb.toString();
        return res;
    }
}