class Solution {
    public int countDigits(int n) {
        // code here
        int i=0;
        while(n>0)
        {
            n = n/10;
            i++;
        }
        return i;
    }
}
