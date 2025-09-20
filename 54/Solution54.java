import java.util.ArrayList;
import java.util.List;

class Solution54 {
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;
    private static final int UP = 4;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int column = 0;
        int row = 0;
        int columnBorder = matrix[0].length - 1;
        int rowBorder = matrix.length - 1;
        int quantity = (matrix[0].length * matrix.length) - 1;
        int direction = RIGHT;
        int ratio = 0;
        while (result.size() <= quantity) {
            result.add(matrix[row][column]);

            if (direction == UP) {
                if (row > rowBorder) {
                    row--;
                } else {
                    direction = RIGHT;
                    column++;
                    columnBorder = matrix[row].length - 1 - ratio;
                }

            } else if (direction == LEFT) {

                if (column > columnBorder) {
                    column--;
                } else {
                    direction = UP;
                    ratio++;
                    row--;
                    rowBorder = ratio;
                }

            } else if (direction == DOWN) {

                if (row < rowBorder) {
                    row++;
                } else {
                    direction = LEFT;
                    column--;
                    columnBorder = ratio;
                }

            } else {

                if (column < columnBorder) {
                    column++;
                } else {
                    direction = DOWN;
                    row++;
                    rowBorder = matrix.length - 1 - ratio;
                }
            }

        }
        return result;
    }

}