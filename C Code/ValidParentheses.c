#include <stdio.h>
#include <string.h>

int isValid(char s[]);

int main()
{
    char c[] = "([)]";
    printf("%d", isValid(c));

    return 0;
}

int isValid(char s[])
{
    int len = strlen(s);
    if (len % 2 != 0)
        return 0; // If the length is odd, the string can't be valid

    char stack[len];
    int top = -1;

    for (int i = 0; i < len; i++)
    {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[')
        {
            stack[++top] = s[i];
        }
        else
        {
            if (top == -1)
                return 0; // Closing bracket without corresponding opening bracket

            char open = stack[top--];
            if ((s[i] == ')' && open != '(') ||
                (s[i] == '}' && open != '{') ||
                (s[i] == ']' && open != '['))
                return 0; // Mismatched closing bracket
        }
    }

    return top == -1 ? 1 : 0; // If stack is empty, return true, else false
}
