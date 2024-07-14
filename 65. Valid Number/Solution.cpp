#include <string>
#include <iostream>
using namespace std;

class Solution
{
public:
    static bool isNumber(string s)
    {
        if (s.empty() || s[0] == 'e' || s[0] == '.')
        {
            return false;
        }

        short count_e = 0;
        short count_dot = 0;
        short count_sign = 0;
        for (char ch : s)
        {
            if (!isdigit(ch) && ch != 'e' && ch != 'E' && ch != '.' && ch != '+' && ch != '-' || count_e > 1 || count_dot > 1 || count_sign > 2)
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
        if (count_e == 1 && count_dot == 1)
        {
            count_dot = 0, count_e = 0;
            short i = 0;
            while (count_e != 1)
            {
                if (s[i] == 'e' || s[i] == 'E')
                {
                    count_e++;
                }
                if (s[i] == '.')
                {
                    count_dot++;
                }
                if (count_dot == 0 && count_e == 1)
                {
                    return false;
                }
                i++;
            }
        }

        return true;
    }
};

int main(int argc, char const *argv[])
{
    Solution s;
    cout << s.isNumber("123e104");
    return 0;
}
