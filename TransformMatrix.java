import java.util.Arrays;

class Solution {

    public static int[][] transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[][] transposed = new int[cols][rows];

        // TODO: Complete the transposition process by filling in the transposed matrix
for (int row = 0; row < rows; row++) {
for (int col = 0; col < cols; col++) {
    transposed[col][row] = matrix[row][col];

}
}
        
        return transposed;
    }

    public static void main(String[] args) {
        int[][] original_matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // TODO: Call transformMatrix with original_matrix and store the result in a variable
        // TODO: Print out the transposed matrix

        System.out.println(Arrays.deepToString(transformMatrix(original_matrix)));
    }
}
