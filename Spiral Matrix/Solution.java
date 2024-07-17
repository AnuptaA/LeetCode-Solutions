class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i = 0, j = 0;
        int rlo = 0, rhi = matrix.length, clo = 0, chi = matrix[0].length;
        int n = rhi * chi, ctr = 1;

        List<Integer> out = new ArrayList<>();
        out.add(matrix[i][j]);

        while (ctr != n) {
            while (++j != chi) {
                out.add(matrix[i][j]);
                ctr++;
            }
            j--;
            chi--;
            if (ctr == n) break;
            while (++i != rhi) {
                out.add(matrix[i][j]);
                ctr++;
            }
            i--;
            rhi--;
            if (ctr == n) break;
            while (--j != clo - 1) {
                out.add(matrix[i][j]);
                ctr++;
            }
            j++;
            clo++;
            if (ctr == n) break;
            while (--i != rlo) {
                out.add(matrix[i][j]);
                ctr++;
            }
            i++;
            rlo++;
        }
        return out;
    }
}