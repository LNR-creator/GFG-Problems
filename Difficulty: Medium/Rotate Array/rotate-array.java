class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    static void reverse(int[] arr,int l,int h)
    {
        while(l<=h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
}