class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = -9999999;
        int sums = 0;
        for(int i = 0; i < nums.length; i++){
            sums+=nums[i];
            maxi = Math.max(maxi,sums);
            if(sums < 0){
                sums = 0;
            }
        
        }

        return maxi;
    }
}