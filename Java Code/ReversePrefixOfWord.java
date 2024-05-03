
public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word;
        char ch;

        word = "danish";
        ch = 'i';

        String subWord1 = word.substring(0, word.indexOf(ch) + 1);
        String subWord2 = word.substring(word.indexOf(ch) + 1, word.length());
        char[] arr = subWord1.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        subWord1 = new String(arr);

        word = subWord1 + subWord2;
        System.out.println(word);
    }
}