import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        int[] digits = { 9, 9, 9 };

        for (int i : plusOne(digits)) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 1; i--) {

            digits[i] = digits[i] + 1;

            if (digits[i] == 10) {
                digits[i] = 0;
            } else if (digits[0] == 10) {
                digits[0] = 0;
                // int []nums = new int[digits.length + 1];
                // nums[0] = 1;
                ArrayList<Integer> nums = new ArrayList<>();
                nums.add(1);
                nums.addAll(digits);
                return nums.toArray();
            } else {
                return digits;
            }

        }
        return digits;
    }
}