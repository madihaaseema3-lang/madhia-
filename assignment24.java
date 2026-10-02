java code for you are given N string of length M count the number of anagramic groups .
  import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashSet<String> groups = new HashSet<>();

        for (String str : arr) {

            // Convert string to character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Sorted string is the anagram key
            groups.add(new String(chars));
        }

        System.out.println("Number of anagram groups: " + groups.size());
    }
}
