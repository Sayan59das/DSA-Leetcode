
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean check = false;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(st.empty()){
                    return false;
                }
                char x = st.peek();
                st.pop();
                if(('(' == x && s.charAt(i) == ')') || ('[' == x && s.charAt(i) == ']') || ('{' == x && s.charAt(i) == '}')){
                    check = true;
                }
                else{
                    check = false;
                    break;
                }
            }
        }

        if(!st.empty()){
            check = false;
        }

        return check;
    }
}
