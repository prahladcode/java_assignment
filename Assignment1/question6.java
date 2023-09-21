import java.util.Scanner;
public class tempvariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number; ");
        int  num2 = input.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("first number:" +num1);
        System.out.println("second number: " +num2);

        num1 = num1 + num2;
        num1 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Before swapping: ");
        System.out.println("first number:" +num1);
        System.out.println("second number: " +num2);


    }
}
