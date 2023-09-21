public class PrintArrayValues {
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
    }
}
