#include <stdio.h>
#include <stdbool.h>

bool containsDuplicate(int nums[], int numsSize);

int main()
{
    int nums[] = {1, 2, 3, 1};
    short size = sizeof(nums) / sizeof(nums[0]);

    printf("%d", containsDuplicate(nums, size));

    return 0;
}

bool containsDuplicate(int nums[], int numsSize)
{
    for (short i = 0; i < numsSize - 1; i++)
    {
        for (short j = i + 1; j < numsSize; j++)
        {
            if (nums[i] == nums[j])
                return true;
        }
    }
    return false;
}