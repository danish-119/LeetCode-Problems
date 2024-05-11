import java.util.Arrays;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        String[] arr = findWords(words);

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        String[] arr = { "", "", "" }; // Initialize elements to empty strings
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                switch (word.charAt(j)) {
                    case 'q':
                    case 'w':
                    case 'e':
                    case 'r':
                    case 't':
                    case 'y':
                    case 'u':
                    case 'i':
                    case 'o':
                    case 'p':
                        arr[0] += word.charAt(j);
                        break;
                    case 'a':
                    case 's':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':
                        arr[1] += word.charAt(j);
                        break;
                    case 'z':
                    case 'x':
                    case 'c':
                    case 'v':
                    case 'b':
                    case 'n':
                    case 'm':
                        arr[2] += word.charAt(j);
                        break;
                    default:
                        break;
                }
            }

        }
        return arr;
    }
}
