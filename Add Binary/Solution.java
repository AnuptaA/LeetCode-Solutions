class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = a.length() - 1, j = b.length() - 1, x, y;
        while (i >= 0 && j >= 0) {
            x = a.charAt(i) - '0';
            y = b.charAt(j) - '0';
            sb.append((x + y + carry) % 2);
            carry = (x + y + carry) / 2;
            i--;
            j--;
        }
        while (i >= 0) {
            x = a.charAt(i) - '0';
            sb.append((x + carry) % 2);
            carry = (x + carry) / 2;
            i--;
        }
        while (j >= 0) {
            y = b.charAt(j) - '0';
            sb.append((y + carry) % 2);
            carry = (y + carry) / 2;
            j--;
        }
        if (carry == 1) sb.append('1');

        String reversed = sb.toString();
        sb = new StringBuilder();
        for (i = reversed.length() - 1; i >= 0; i--) sb.append(reversed.charAt(i));
        
        return sb.toString();
    }
}