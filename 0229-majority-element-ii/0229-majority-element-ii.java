class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int el1 = -999999;
        int el2 = -999999;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != el2){
                count1 = 1;
                el1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != el1){
                count2 = 1;
                el2 = nums[i];
            }
            else if(nums[i] == el1){
                count1++;
            }
            else if(nums[i] == el2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == el1){
                count1++;
            }
            if(nums[i] == el2){
                count2++;
            }
        }
        int min = (int)(nums.length/3);
        if(count1 > min){
            arr.add(el1);
        }
        if(count2 > min){
            arr.add(el2);
        }
        return arr;
    }
}