22.given an array of integers return the number of distinct absolute values among the elements of the array absolute of any value is defined as its positive equivalent ABS(-5)=505 MATHEMATICALLY |-5|=|5|=1
  import java.util.HashSet;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        int[] arr = {-5, 5, -2, 2, 7, -7, 3};

        HashSet<Integer> distinct = new HashSet<>();

        for (int num : arr) {
            distinct.add(Math.abs(num));
        }

        System.out.println("Number of distinct absolute values: "
                           + distinct.size());
    }
}
