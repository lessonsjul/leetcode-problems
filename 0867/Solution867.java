class Solution867 {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                result[c][r] = matrix[r][c];
            }
        }

        return result;
    }
}