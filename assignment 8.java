write a java code by spliting a sentence into word and then rebuilt it in new format
  public class SentenceFormat {

    public static void main(String[] args) {

        String sentence = "Java is easy to learn";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Rebuild the sentence in a new format
        StringBuilder newSentence = new StringBuilder();

        for (String word : words) {
            newSentence.append(word).append("\n");
        }

        // Print the rebuilt sentence
        System.out.println("New format:");
        System.out.println(newSentence);
    }
}
