class Solution48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int totalLevels = n / 2;

        int circle = 0;
        int level = 0;

        while (level < totalLevels) {

            int totalCircles = n - 1 - level;

            while(circle < totalCircles) {
                var tmp = matrix[level][circle]; 

                matrix[level][circle] = matrix[n-1-circle][level];
                matrix[n-1-circle][level] = matrix[n - 1 - level][n - 1 - circle];
                matrix[n - 1 - level][n - 1 - circle] = matrix[circle][n - 1 - level];
                matrix[circle][n - 1 - level] = tmp;

                circle++;
            }

            level++;
            circle = level;
        }
    }
}