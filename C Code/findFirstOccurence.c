#include <stdio.h>
#include <string.h>

int strStr(char *haystack, char *needle) {
    int haystack_len = strlen(haystack);
    int needle_len = strlen(needle);
    
    // Edge case: needle is an empty string
    if (needle_len == 0) return 0;
    
    // Iterate through the haystack
    for (int i = 0; i <= haystack_len - needle_len; i++) {
        // Check if the substring of haystack matches needle
        int j;
        for (j = 0; j < needle_len; j++) {
            if (haystack[i + j] != needle[j])
                break;
        }
        
        // If the inner loop completed without breaking, needle is found
        if (j == needle_len) return i;
    }
    
    // Needle not found in haystack
    return -1;
}

int main() {
    char haystack1[] = "sadbutsad";
    char needle1[] = "sad";
    printf("Output for example 1: %d\n", strStr(haystack1, needle1)); // Output: 0
    
    char haystack2[] = "leetcode";
    char needle2[] = "leeto";
    printf("Output for example 2: %d\n", strStr(haystack2, needle2)); // Output: -1
    
    return 0;
}
