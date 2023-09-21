public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        String text = "Hello, World!";
        int length = calculateStringLength(text);
        System.out.println("Length of the string: " + length);
    }

    
    public static int calculateStringLength(String str) {
        int length = 0;
        char[] charArray = str.toCharArray();
        
        for (char c : charArray) {
            length++;
        }
        
        return length;
    }
}
