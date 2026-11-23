import java.util.Arrays;

class Solution {

    public static int[][] transformMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[0][0];

        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[][] transposed = new int[cols][rows];

        // TODO: Modify the loop to transpose the matrix in reverse order
        for(int row = 0; row < rows; row ++){
            for (int col = 0; col < cols; col++) {
                transposed[col][row] = matrix[row][col];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        int[][] seatingChart = {
            {101, 102, 103, 104},
            {201, 202, 203, 204},
            {301, 302, 303, 304}
        };

        // TODO: Store the result of transformMatrix in transposedSeating and print it
        System.out.println(Arrays.deepToString(transformMatrix(seatingChart)));

    }
}
