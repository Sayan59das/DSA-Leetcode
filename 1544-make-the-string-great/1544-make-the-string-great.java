class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(char x : s.toCharArray()){
            if(sb.length() > 0 && ((sb.charAt(sb.length() - 1)-x)==32 || (sb.charAt(sb.length() - 1)-x)== -32)){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(x);
            }
        }
        return String.valueOf(sb);
        
    }
}