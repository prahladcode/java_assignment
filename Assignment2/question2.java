import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal, time (in years), and rate of interest (in %), separated by spaces: ");
        String input = scanner.nextLine();

      
        String[] inputData = input.split(" ");

        if (inputData.length != 3) {
            System.out.println("Invalid input format. Please enter principal, time, and rate of interest separated by spaces.");
        } else {
          
            double principal = Double.parseDouble(inputData[0]);
            double time = Double.parseDouble(inputData[1]);
            double rateOfInterest = Double.parseDouble(inputData[2]);

         
            double simpleInterest = (principal * rateOfInterest * time) / 100;

            System.out.println("Simple Interest: " + simpleInterest);
        }

        scanner.close();
    }
}
