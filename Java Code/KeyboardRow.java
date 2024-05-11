import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        String[] arr = findWords(words);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        String[] rows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };

        for (String word : words) {
            boolean sameRow = true;
            String lowercaseWord = word.toLowerCase();
            int row = -1;

            // Find the row of the first character of the word
            for (int i = 0; i < rows.length; i++) {
                if (rows[i].contains(String.valueOf(lowercaseWord.charAt(0)))) {
                    row = i;
                    break;
                }
            }

            // Check if all characters belong to the same row
            for (int i = 1; i < word.length(); i++) {
                if (!rows[row].contains(String.valueOf(lowercaseWord.charAt(i)))) {
                    sameRow = false;
                    break;
                }
            }

            // If all characters are in the same row, add the word to the result
            if (sameRow) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

}
