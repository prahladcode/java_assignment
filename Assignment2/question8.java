public class ArrayForEach {
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
        for (int value : integers) {
            System.out.print(value + " ");
        }
        
        System.out.println("\nValues of the float array:");
        for (float value : floats) {
            System.out.print(value + " ");
        }
        
        System.out.println("\nValues of the double array:");
        for (double value : doubles) {
            System.out.print(value + " ");
        }
        
        System.out.println("\nValues of the short array:");
        for (short value : shorts) {
            System.out.print(value + " ");
        }
        
        System.out.println("\nValues of the byte array:");
        for (byte value : bytes) {
            System.out.print(value + " ");
        }
    }
}
