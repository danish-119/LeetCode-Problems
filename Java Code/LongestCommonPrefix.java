public class LongestCommonPrefix {
    
    public static void main(String[] args) {
    
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        StringBuilder prefix = new StringBuilder();

        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }

        for (short i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
    }
}