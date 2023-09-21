public class OddPositionValuesForEach {
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
        
        
        System.out.println("Values at odd positions of the integer array:");
        int position = 1; 
        for (int value : integers) {
            if (position % 2 != 0) {
                System.out.print(value + " ");
            }
            position++;
        }
        
        System.out.println("\nValues at odd positions of the float array:");
        position = 1; 
        for (float value : floats) {
            if (position % 2 != 0) {
                System.out.print(value + " ");
            }
            position++;
        }
        
        System.out.println("\nValues at odd positions of the double array:");
        position = 1; 
        for (double value : doubles) {
            if (position % 2 != 0) {
                System.out.print(value + " ");
            }
            position++;
        }
        
        System.out.println("\nValues at odd positions of the short array:");
        position = 1; 
        for (short value : shorts) {
            if (position % 2 != 0) {
                System.out.print(value + " ");
            }
            position++;
        }
        
        System.out.println("\nValues at odd positions of the byte array:");
        position = 1; 
        for (byte value : bytes) 
            if (position % 2 != 0) {
                System.out.print(value + " ");
            }
            position++;
        }
    }
}
