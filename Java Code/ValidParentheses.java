import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0)
            return false; // If the length is odd, the string can't be valid

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty())
                    return false; // Closing bracket without corresponding opening bracket

                char open = stack.pop();
                if ((currentChar == ')' && open != '(') ||
                        (currentChar == '}' && open != '{') ||
                        (currentChar == ']' && open != '['))
                    return false; // Mismatched closing bracket
            }
        }

        return stack.isEmpty(); // If stack is empty, return true, else false
    }

    public static void main(String[] args) {
        String c = "([)]";
        System.out.println(isValid(c));
    }
}

