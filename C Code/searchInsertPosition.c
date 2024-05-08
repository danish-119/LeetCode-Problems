#include <stdio.h>

short searchInsertPosition(int nums[], int numsSize, int target);

int main(){
    int nums[] = {1, 3, 5, 7};
    short size = sizeof(nums) / sizeof(nums[0]);

    printf("%d", searchInsertPosition(nums, size, 6));
    
    return 0;
}

short searchInsertPosition(int nums[], int numsSize, int target){
    short count = 0;

    for(short i = 0; i < numsSize && nums[i] < target; i++){
        if(nums[i] <= target){
            count++;
        }
    }

    return count;
}