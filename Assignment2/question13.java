public class JaggedArray {
    public static void main(String[] args) {
        
        int[][] jaggedArray = new int[4][];
        
        
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[1];
        
        
        int value = 1;
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                jaggedArray[row][col] = value++;
            }
        }
        
        
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                System.out.print(jaggedArray[row][col] + " ");
            }
            System.out.println(); 
        }
    }
}
