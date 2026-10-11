class Solution {
    public int compress(char[] chars) {
        StringBuilder x = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 0;
        while(i <chars.length){
            if(chars[i] == chars[j]){
                count+=1;
                i++;
            }
            else{
                // String a = String.valueOf();
                x.append(chars[j]);
                if(count > 1){
                    // String y = String.valueOf(count);
                    x.append(count);
                }
                count = 0;
                j = i;
            }
        }
        // String a = String.valueOf(chars[j]);
        x.append(chars[j]);
        if (count > 1) {
            // String y = String.valueOf(count);
            x.append(count);
        }
        for(int k = 0; k < x.length(); k++){
            chars[k] = x.charAt(k);
        }
        return x.length();
    }
}