class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m == r && n == c || (m * n != r * c)) {
            return mat;
        }

        int[][] result = new int[r][c];

        int row = 0;
        int column = 0;


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                result[row][column] = mat[i][j];

                column++;

                if (column >= c) {
                    row++;
                    column = 0;
                }
            }
        }


        return result;
    }
}