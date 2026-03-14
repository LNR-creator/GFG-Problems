// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        int xor = 0;
        for(int n : arr)
        {
            xor = xor ^ n;
        }
        
        return xor;
    }
}