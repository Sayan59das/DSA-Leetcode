class Solution {
    public int maxArea(int[] height) {
        int current = 0;
        int start = 0;
        int end = height.length-1;
        while(start < end){
            int min = -9999999;
            int dist = end-start;
            if(height[start] > height[end]){
                min = height[end];
            }
            else{
                min = height[start];
            }
            int cont = dist * min;
            if(cont > current){
                current = cont;
            }
            if(height[start] > height[end]){
                end--;
            }
            else{
                start++;
            }

        }
        return current;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna