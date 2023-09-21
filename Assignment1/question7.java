import java.util.Scanner;
public class withoutusingoperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = input.nextInt();

        int product = 0;

        if (num1 < 0 && num2 < 0) {
            num1 = -num1;
            num2 = -num2;

            else (num2 < 0) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            for (int i = 0; 1 < num2; i++) {
                product += num1;


                System.out.println("The product is: " + product);

                input.close();
            }
            }
        }
    }
}
