public class ArrayForWhile {
    public static void main(String[] args) {
       
        int[] integers = new int[10];
        
        
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }
        
      
        float[] floats = new float[5];
        
        
        for (int i = 0; i < floats.length; i++) {
            floats[i] = (float)(Math.random() * 100);
        }
        
        
        double[] doubles = new double[8];
        
        
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.random() * 100;
        }
        
        
        short[] shorts = new short[4];
        
        
        for (int i = 0; i < shorts.length; i++) {
            shorts[i] = (short)(1000 + i);
        }
        
        
        byte[] bytes = new byte[5];
        
        
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)(-10 + i);
        }
        
        
        System.out.println("Values of the integer array:");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }
        
        System.out.println("\nValues of the float array:");
        for (int i = 0; i < floats.length; i++) {
            System.out.print(floats[i] + " ");
        }
        
        System.out.println("\nValues of the double array:");
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i] + " ");
        }
        
        System.out.println("\nValues of the short array:");
        for (int i = 0; i < shorts.length; i++) {
            System.out.print(shorts[i] + " ");
        }
        
        System.out.println("\nValues of the byte array:");
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        
        
        System.out.println("\n\nValues of the integer array (while loop):");
        int index = 0;
        while (index < integers.length) {
            System.out.print(integers[index] + " ");
            index++;
        }
        
        System.out.println("\nValues of the float array (while loop):");
        index = 0;
        while (index < floats.length) {
            System.out.print(floats[index] + " ");
            index++;
        }
        
        System.out.println("\nValues of the double array (while loop):");
        index = 0;
        while (index < doubles.length) {
            System.out.print(doubles[index] + " ");
            index++;
        }
        
        System.out.println("\nValues of the short array (while loop):");
        index = 0;
        while (index < shorts.length) {
            System.out.print(shorts[index] + " ");
            index++;
        }
        
        System.out.println("\nValues of the byte array (while loop):");
        index = 0;
        while (index < bytes.length) {
            System.out.print(bytes[index] + " ");
            index++;
        }
    }
}
