public class StringToMutableString {
    public static void main(String[] args) {
       
        String immutableString = "Hello, World!";

      
        StringBuilder mutableStringBuilder = new StringBuilder(immutableString);

       
        mutableStringBuilder.append(" Welcome");
        mutableStringBuilder.insert(6, "Java ");
        mutableStringBuilder.replace(0, 5, "Hi");

        
        String resultString = mutableStringBuilder.toString();

       
        System.out.println("Mutable String: " + resultString);
    }
}
