/*
 * Author : Naveen Rohilla
 * Objective : CHFAR
  */
 
 
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int t; 
	long long int sum, sum2;
	long int n, k;
	long int * arr;
	bool flag;
	cin >> t;
	while (t--) {
		cin >> n >> k;
		arr = new long int[n];
		sum = 0;
		sum2 = 0;
		for (int i = 0; i < n; i++) {
			cin >> arr[i];
			sum += arr[i];
			sum2 += arr[i] * arr[i];
		}
		sort(arr, arr + n, greater<int>());
		flag = false;
		for (long int i = 0; ! flag && i < k; i++) {
			if (sum >= sum2) {
				flag = true;
			}
			else {
				sum2 = sum2 - arr[i] * arr[i] + 1;
				sum = sum - arr[i] + 1;
			}
		}
		if (sum >= sum2) {
			cout << "YES" << endl;
		}
		else if (flag) {
			cout << "YES" << endl;
		}
		else {
			cout << "NO" << endl;
		}
	}
	return 0;
}
