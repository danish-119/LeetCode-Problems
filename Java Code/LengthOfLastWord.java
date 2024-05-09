class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        return arr[arr.length - 1].length();
    }
}