#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool isIsomorphic(string s, string t) { 
        if(s.length() != t.length()) return false;
        vector<int> v(128); 
        vector<int> v1(128);
        for (int i = 0; i < s.length(); i++){
            if (v[s[i]] != v1[t[i]]) return false;
            v[s[i]] = i + 1;
            v1[t[i]] = i + 1;
        }
        return true;
    }
};
int main()
{
    string s = "egg";
    string t = "add";
    Solution obj;
    cout << obj.isIsomorphic(s, t);
    return 0;
}