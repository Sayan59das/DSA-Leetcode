class Solution {
    public int removeElement(int[] nums, int val) {
        int[] array = new int[nums.length];
            int size = nums.length;
            int x = 0;
            int total = 0;
            for(int i = 0; i < size; i++){
                if(nums[i] == val){
                    
                }
                else{
                    nums[x] = nums[i];
                    total+=1;
                    x++;
                }
            }
            return total;
    }
}