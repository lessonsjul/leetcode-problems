class Solution498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] result = new int[mat.length * mat[0].length];
        
        int count = 0;
        boolean isUp = true;
        int row = 0;
        int column = 0;

        while (count < result.length) {
            result[count] = mat[row][column];

            if (isUp) {
                if (row > 0 && column < mat[row - 1].length - 1) {
                    row--;
                    column++;
                } else if (column < mat[row].length - 1) {
                   column++;
                   isUp = false;
                } else if (row < mat.length - 1) {
                    row++;
                    isUp = false;
                }
                
            } else {
                if (row < mat.length - 1 && column > 0) {
                    row++;
                    column--;
                } else if (row < mat.length - 1) {
                    row++;
                    isUp = true;
                } else if (column < mat[row].length - 1) {
                    column++;
                    isUp = true;
                }
            }

            count++;
        } 

        return result;
    }
}