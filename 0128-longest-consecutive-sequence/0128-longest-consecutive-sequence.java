class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        int current = 1;
        int last = -999999;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == last){
                continue;
            }
            if(nums[i]-1 == last){
                current+=1;
                last = nums[i];
            }
            else if(nums[i]-1 != last){
                current = 1;
                last = nums[i];
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }
}