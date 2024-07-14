#include <stdio.h>

int containerWithMostWater(int height[], int size);

int main()
{
    int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    printf("%d", containerWithMostWater(height, 9));

    return 0;
}

int containerWithMostWater(int height[], int size)
{
    int product = 1;

    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            int temp;

            if (height[i] <= height[j])
                temp = height[i] * (j-i);

            else if (height[i] > height[j])
                temp = height[j] * (j-i);
            
           
            if (temp > product)
                product = temp;
        }
    }

    return product;
}