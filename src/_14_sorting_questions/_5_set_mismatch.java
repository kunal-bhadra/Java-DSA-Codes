package _14_sorting_questions;

// https://leetcode.com/problems/set-mismatch/
class _5_set_mismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = {0, 0};
        
        //sorting
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        
        //searching
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans[0] = nums[j];
                ans[1] = j + 1;
            }
        }
        
        return ans;
    }
}