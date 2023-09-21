public class StringBuffer {
    public static void main(String[] args) {
        
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

       
        stringBuffer.append("World!");

        
        stringBuffer.insert(7, "Java ");

        
        stringBuffer.replace(0, 5, "Hi");

        
        stringBuffer.delete(3, 5);

       
        System.out.println(stringBuffer.toString());
    }
}
