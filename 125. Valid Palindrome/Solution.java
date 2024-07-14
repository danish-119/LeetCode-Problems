class Solution {
    public static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;
    }
}