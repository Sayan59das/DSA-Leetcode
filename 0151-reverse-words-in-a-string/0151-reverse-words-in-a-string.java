class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        char[] x = s.toCharArray();
        ulta(x, 0, x.length-1);
        int start = 0;
        int end = 0;
        int i = 0;
        for(int j = 0; j < x.length; j++){
            if(x[j] == ' '){
                end = j-1;
                ulta(x, start, end);
                start = j+1;
            }
        }
        end = x.length-1;
        ulta(x, start, end);
        String y = new String(x);
        return y;
    }
    public void ulta(char[] x, int start, int end){
        while(start < end){
            char temp = x[start];
            x[start] = x[end];
            x[end] = temp;
            start++;
            end--;
        }
    }
}