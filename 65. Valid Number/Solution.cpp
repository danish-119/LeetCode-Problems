#include <string>
using namespace std;

class Solution
{
public:
    bool isNumber(string s)
    {
        if (s.empty())
        {
            return false;
        }

        short count_e = 0;
        short count_dot = 0;
        short count_sign = 0;
        for (char ch : s)
        {
            if (!isdigit(ch) && ch != 'e' && ch != 'E' && ch != '.' && ch != '+' && ch != '-' || count_e > 1 || count_dot > 1 || count_sign > 1 || s[0] == 'e' || s[0] == '.')
            {
                return false;
            }
            if (ch == 'e' || ch == 'E')
            {
                count_e++;
            }
            if (ch == '.')
            {
                count_dot++;
            }
            if (ch == '+' || ch == '-')
            {
                count_sign++;
            }
        }

        return true;
    }
};