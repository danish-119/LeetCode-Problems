public class Test {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        StringBuilder prefix = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        
        for (int i = 0; i < minLength; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }
        
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs)); // Output: "fl"
    }
}

