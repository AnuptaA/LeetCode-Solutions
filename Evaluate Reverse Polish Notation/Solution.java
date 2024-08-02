class Solution {
    public int evalRPN(String[] tokens) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        boolean add = false, sub = false, mul = false, div = false;
        while (i < tokens.length) {
            if (tokens[i].equals("+")) add = true;
            else if (tokens[i].equals("-")) sub = true;
            else if (tokens[i].equals("*")) mul = true;
            else if (tokens[i].equals("/")) div = true;
            else stack.push(Integer.parseInt(tokens[i]));
            if (add || sub || mul || div) {
                int a = stack.pop();
                int b = stack.pop();
                if (add) stack.push(b + a);
                else if (sub) stack.push(b - a);
                else if (mul) stack.push(b * a);
                else stack.push(b / a);
                add = false;
                sub = false;
                mul = false;
                div = false;
            }
            i++;
        }
        return stack.pop();
    }
}