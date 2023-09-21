public class MatrixScalarMultiplication {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int scalar = 2;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] resultMatrix = new int[rows][cols];

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix[i][j] * scalar;
            }
        }

       
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        
        System.out.println("\nResult Matrix (Matrix multiplied by " + scalar + "):");
        printMatrix(resultMatrix);
    }

    
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}
