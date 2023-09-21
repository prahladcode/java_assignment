import java.util.Scanner;

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter employee sex (M/F): ");
        char sex = scanner.next().charAt(0);

        
        System.out.println("\nEmployee Record:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Sex: " + sex);

        scanner.close();
    }
}
