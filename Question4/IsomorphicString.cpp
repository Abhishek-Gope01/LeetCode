#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.length() != t.length()) return false;

        unordered_map<char,char> map;
        unordered_set<char> set;

        for (int i = 0; i < s.length(); i++){
            // If element s[i] is present in the map then
            // compare it with key value
            if (map.find(s[i]) != map.end()){
                if(map[s[i]] != t[i]) return false;
            }

            // If element s[i] is seen for first time
            else{
                // If t[i] is already mapped with other s[i]
                if(set.find(t[i]) != set.end()) return false;
            }

            map[s[i]] = t[i];
            set.insert(t[i]);
            
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