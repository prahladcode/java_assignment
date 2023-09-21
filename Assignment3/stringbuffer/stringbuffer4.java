public class MutableString{
    public static void main(String[] args) {
        
        String immutableString = "Hello, World!";

      
        StringBuilder mutableString = new StringBuilder(immutableString);

        
        mutableString.append(" Welcome");
        mutableString.insert(13, " to");
        mutableString.replace(0, 5, "Hi");

        
        System.out.println("Mutable String: " + mutableString.toString());
    }
}
