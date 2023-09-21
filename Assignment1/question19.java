import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer 'n': ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;

            
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
