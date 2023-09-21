
interface ArraySumCalculator {
    int calculateSum(int[] arr);
}

class SimpleArraySumCalculator implements ArraySumCalculator {
    @Override
    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

public class ArraySumDemoUsingInterface {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
     
        ArraySumCalculator calculator = new SimpleArraySumCalculator();
        
      
        int sum = calculator.calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }
}
