#include<bits/stdc++.h>
using namespace std;
vector<int> pascalTriangleRow(int rowNo) {
	vector<int> pascal;
	pascal.push_back(1);
 	rowNo--;
	for (int i = 1; i <= rowNo; i++){
        // N C R = N C R -1  * (N - R + 1) / R
		int rowElement = pascal.back() * (rowNo - i + 1) / i;
		pascal.push_back(rowElement);
	}
	return pascal;
}
int main()
{

return 0;
}