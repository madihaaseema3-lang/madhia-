find the sum and average of the array in java
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Find sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Find average
        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
