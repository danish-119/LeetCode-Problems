#include <stdbool.h>
#include <stdio.h>

int squareSumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n /= 10;
    }
    return sum;
}

bool isHappy(int n) {
    int slow = n, fast = n;
    do {
        slow = squareSumOfDigits(slow);
        fast = squareSumOfDigits(squareSumOfDigits(fast));
    } while (slow != fast);
    return slow == 1;
}

int main() {
    int n1 = 19;
    printf("Input: n = %d\nOutput: %s\n", n1, isHappy(n1) ? "true" : "false");

    int n2 = 2;
    printf("Input: n = %d\nOutput: %s\n", n2, isHappy(n2) ? "true" : "false");

    return 0;
}
