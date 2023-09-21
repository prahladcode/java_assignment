import java.util.Scanner;

public class areaofsquare {
    public static void main(String[] args){
        int length,area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of square:");
        length = s.nextInt();
        area = length*length;
        System.out.println("area of square: "+area);

    }
}
