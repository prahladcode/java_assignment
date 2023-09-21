public class PrintNameFromArray {
    public static void main(String[] args) {
        
        char[] nameArray = {'J', 'o', 'h', 'n'};

        
        System.out.print("My name is: ");
        for (char c : nameArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
