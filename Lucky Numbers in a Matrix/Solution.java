class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        Map<Integer, Integer> mp_max = new HashMap<>(), mp_min = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    mp_min.put(i, j);
                } 
            }
        }
        System.out.println();
        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    mp_max.put(j, i);
                }
            }
        }
        for (int i : mp_min.keySet()) {
            int j = mp_min.get(i);
            if (mp_max.containsKey(j) && mp_max.get(j) == i) out.add(matrix[i][j]);
        }
        return out;
    }
}