public class Matrix {
    public static void main(String[] args) {
        
        int rows = 3;
        int cols = 4;

        
        int[][] matrix = new int[rows][cols];

    
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }

       
        System.out.println("Matrix Elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}
