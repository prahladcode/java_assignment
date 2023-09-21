public class swapnumber {
    public static void main(String[] args) {
        int x = 48;
        int y = 45;

        System.out.println("Before swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

        swap(x, y);
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);
    }
}