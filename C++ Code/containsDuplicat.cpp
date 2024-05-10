#include <vector>
#include <unordered_set>

class Solution {
public:
    bool containsDuplicate(std::vector<int>& nums) {
        std::unordered_set<int> numSet;
        for (int num : nums) {
            if (numSet.find(num) != numSet.end()) {
                // If num is already in the set, it's a duplicate
                return true;
            }
            // Otherwise, add num to the set
            numSet.insert(num);
        }
        // No duplicates found
        return false;
    }
};
