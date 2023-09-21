import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("enter width of the rectangle:");
        double width = scanner.nextDouble ();
        double area = length * width;
        System.out.println("area of the rectangle:" + area);
        scanner.close();

    }
}
