import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        int[] digits = { 1, 9, 9 };

        for (int i : plusOne(digits)) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            digits[i] = digits[i] + 1;

            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }

        }

        if (digits[0] == 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int j = 1; j < arr.length; j++) {
                arr[j] = digits[j - 1];
            }
            return arr;
        }

        return digits;
    }
}