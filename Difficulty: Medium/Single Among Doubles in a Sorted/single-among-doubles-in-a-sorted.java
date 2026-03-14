class Solution {
    int single(int[] arr) {
        // code here
        int xor = 0;
        
        for(int num : arr)
        {
            xor = xor ^ num;
        }
        return xor;
    }
}