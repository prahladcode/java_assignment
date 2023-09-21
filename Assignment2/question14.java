public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
       
        try {
            int element = numbers[10]; 
            System.out.println("Element at index 10: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: ");
        }
    }
}
