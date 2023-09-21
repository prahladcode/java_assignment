public class twoDArray {
    public static void main(String[] args) {
       
        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        
        int[][] array2 = new int[3][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;
        array2[2][0] = 7;
        array2[2][1] = 8;
        array2[2][2] = 9;

        
        int[][] array3 = new int[3][3];
        array3[0] = new int[] { 1, 2, 3 };
        array3[1] = new int[] { 4, 5, 6 };
        array3[2] = new int[] { 7, 8, 9 };

       
        System.out.println("Values of array1:");
        printArray(array1);

        
        System.out.println("\nValues of array2:");
        printArray(array2);

        
        System.out.println("\nValues of array3:");
        printArray(array3);
    }

 
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
