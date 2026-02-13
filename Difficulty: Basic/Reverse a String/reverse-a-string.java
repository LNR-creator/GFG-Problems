// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // String a = "";
        // // code here
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     a += s.charAt(i);
        // }
        // return a;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}