import java.util.HashMap;

class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

         for (char ch = 'a'; ch <= 'z'; ch++) {
          int number = ch - 'a' + 1;
            alphabetMap.put(ch, number);
        }

        byte len = (byte) columnTitle.length();
        return len;
    }
}