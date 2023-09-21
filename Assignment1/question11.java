import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayName;

            if (dayNumber == 1) {
                dayName = "Sunday";
            } else if (dayNumber == 2) {
                dayName = "Monday";
            } else if (dayNumber == 3) {
                dayName = "Tuesday";
            } else if (dayNumber == 4) {
                dayName = "Wednesday";
            } else if (dayNumber == 5) {
                dayName = "Thursday";
            } else if (dayNumber == 6) {
                dayName = "Friday";
            } else {
                dayName = "Saturday";
            }

            System.out.println("The day is " + dayName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
