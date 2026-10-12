class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = 2000000;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int sums = nums[i] + nums[j] + nums[k];

                if (Math.abs(sums - target) < Math.abs(target - closest)) {
                    closest = sums;
                }

                if (sums > target) {
                    k--;
                }
                else if (sums < target) {
                    j++;
                }
                else {
                    closest = sums;
                    break;
                }
            }
        }
        return closest;
    }
}