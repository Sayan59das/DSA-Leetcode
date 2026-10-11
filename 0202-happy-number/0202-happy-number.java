class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        else{
            while(true){
                int temp = n;
                int sum = 0;
                while(temp > 0){
                    int x = temp % 10;
                    int y = x * x;
                    sum+=y;
                    temp = (int)(temp/10);
                }
                if(sum == 1){
                    return true;
                }
                else if(sum < 10 && sum != 7){
                    return false;
                }
                n = sum;
            }
        }
    }
}