import java.util.HashMap;

public class ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store the last index of each number
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // Check if the number is already in the map
            if (numIndexMap.containsKey(num)) {
                // If the absolute difference between current index and the last index is less
                // than or equal to k, return true
                if (i - numIndexMap.get(num) <= k) {
                    return true;
                }
            }
            // Update the index of the current number
            numIndexMap.put(num, i);
        }

        // No such pair found, return false
        return false;
    }
}
