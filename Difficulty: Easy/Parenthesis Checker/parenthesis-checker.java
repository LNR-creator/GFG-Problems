class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(char ch: s.toCharArray())
        {
            // char ch = s.charAt(i);
           
             if(st.isEmpty()){
                  st.push(ch);
             }
            else if(ch == '[' || ch == '{' || ch == '(')
            {
                st.push(ch);
            }
            else if(st.isEmpty()){
                 return false;
             }
           else if(ch == ')' && st.pop() != '(' ||
                    ch == ']' && st.pop() != '[' ||
                    ch == '}' && st.pop() != '{')
                    {
                        return false;
                    }
        }
         return st.isEmpty();
    }
}
