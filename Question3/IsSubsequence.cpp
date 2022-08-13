#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i{0},j{0};
        while (i < s.size() && j < t.size()){
            // if(s[i] == t[j]){
            //     i += 1;
            //     j += 1;
            // }else {
            //     j += 1;
            // }
            if (s[i] == t[j]) i += 1;
            j += 1;
        }

        if (i == s.length()) return true;
        return false;
    }
};

int main()
{
    string s = "abc";
    string t = "ahbgdc";
    Solution obj;
    cout << obj.isSubsequence(s,t);
    return 0;
}