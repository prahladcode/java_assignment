public class StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder stringBuilder = new StringBuilder();

       
        stringBuilder.append("Hello, ");
        stringBuilder.append("World!");

        
        String resultString = stringBuilder.toString();

        
        System.out.println(resultString);
    }
}
