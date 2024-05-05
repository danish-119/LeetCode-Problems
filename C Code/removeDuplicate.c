#include <stdio.h>

int removeDuplicates(int nums[], int size);

int main()
{
    int nums[] = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
    int size = sizeof(nums) / sizeof(nums[0]);

    printf("Original array: ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", nums[i]);
    }
    printf("\n");

    int newSize = removeDuplicates(nums, size);

    printf("Array after removing duplicates: ");
    for (int i = 0; i < newSize; i++)
    {
        printf("%d ", nums[i]);
    }
    printf("\n");

    return 0;
}

int removeDuplicates(int nums[], int size)
{
    if (size <= 1)
        return size;

    int count = 0;
    int newIndex = 0;

    for (int i = 0; i < size - 1; i++)
    {
        if (nums[i] != nums[i + 1])
        {
            nums[newIndex++] = nums[i];
        }
        else
        {
            count++;
        }
    }

    // Handling the last element
    nums[newIndex++] = nums[size - 1];

    return size - count;
}