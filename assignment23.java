23.GIVEN AN ARRAY OF INTEGERS AND AN INTEGER TARGET PRINT INDIES OF THE TWO numbers such thst the numbers add up to target you may assume that each input would have exactly one solution and you may not the use elemnt tewce you must print the answer indices in ascending order ifno such pair exits return [-1,1]
public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("[-1, -1]");
        }
    }
}
