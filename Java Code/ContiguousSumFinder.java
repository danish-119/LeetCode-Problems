import java.util.ArrayList;

public class ContiguousSumFinder {
    public static void main(String[] args) {
        int target = 13;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Find contiguous sum
        findContiguousSum(nums, target);
    }

    public static void findContiguousSum(int[] nums, int target) {
        ArrayList<Integer> value = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = i;
            value.clear();
            index.clear();

            while (j < nums.length) {
                sum += nums[j];
                value.add(nums[j]);
                index.add(j);

                if (sum == target) {
                    System.out.println("Target is found at index " + index + " with value " + value);
                    return;
                }

                j++;
            }
        }

        System.out.println("Target is not found");
    }
}
