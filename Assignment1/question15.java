import java.util.Scanner;

public class FindGreatestAndLeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double greatest;
        double least;

        
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        
        if (num1 <= num2 && num1 <= num3) {
            least = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            least = num2;
        } else {
            least = num3;
        }

        System.out.println("The greatest number is: " + greatest);
        System.out.println("The least number is: " + least);

        scanner.close();
    }
}
