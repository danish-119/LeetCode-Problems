#include <string>
#include <iostream>
using namespace std;

class Solution
{
public:
    static bool isNumber(string s)
    {
        int n = s.size();
        int i = 0;

        // Skip leading whitespaces
        while (i < n && isspace(s[i]))
            i++;

        // Handle optional sign
        if (i < n && (s[i] == '+' || s[i] == '-'))
            i++;

        bool isNumeric = false;
        bool hasDot = false;
        bool hasE = false;

        while (i < n)
        {
            char c = s[i];

            if (isdigit(c))
            {
                isNumeric = true;
            }
            else if (c == '.')
            {
                if (hasDot || hasE)
                    return false;
                hasDot = true;
            }
            else if (c == 'e' || c == 'E')
            {
                if (hasE || !isNumeric)
                    return false;
                hasE = true;
                isNumeric = false; // Reset isNumeric for the exponent part
                if (i + 1 < n && (s[i + 1] == '+' || s[i + 1] == '-'))
                    i++;
            }
            else
            {
                break;
            }
            i++;
        }

        // Skip trailing whitespaces
        while (i < n && isspace(s[i]))
            i++;

        return isNumeric && i == n;
    }
};

int main()
{
    Solution sol;
    string test1 = "53.5e93";
    string test2 = "1e1e1";
    cout << "Is \"" << test1 << "\" a valid number? " << (Solution::isNumber(test1) ? "Yes" : "No") << endl;
    cout << "Is \"" << test2 << "\" a valid number? " << (Solution::isNumber(test2) ? "Yes" : "No") << endl;
    return 0;
}
