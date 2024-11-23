class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }

        StringBuilder output = new StringBuilder();
        output.append(s.charAt(0));
        output.append(s.charAt(1));

        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == output.charAt(output.length() - 1) 
                && s.charAt(i) == output.charAt(output.length() - 2)) {
                continue;
            }
            output.append(s.charAt(i));
        }

        return output.toString();
    }
}
