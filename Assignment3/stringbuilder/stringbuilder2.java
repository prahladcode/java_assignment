public class StringToBuffer {
    public static void main(String[] args) {
       
        String str = "Hello, World!";

      
        StringBuffer stringBuffer = new StringBuffer(str);

        
        stringBuffer.append(" Welcome");
        stringBuffer.insert(6, "Java ");
        stringBuffer.replace(0, 5, "Hi");

        
        System.out.println("StringBuffer: " + stringBuffer.toString());
    }
}
