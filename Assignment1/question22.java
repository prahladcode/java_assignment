import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        System.out.println("Interest Rates from 1% to 10%:");
        for (int rate = 1; rate <= 10; rate++) {
            double interestRate = rate / 100.0; 

            double simpleInterest = (principal * interestRate * time);

            System.out.println("Interest at " + rate + "%: $" + simpleInterest);
        }

        scanner.close();
    }
}
