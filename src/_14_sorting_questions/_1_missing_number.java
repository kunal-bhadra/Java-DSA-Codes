package _14_sorting_questions;

// https://leetcode.com/problems/missing-number/submissions/
class _1_missing_number {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){ //Case 1 - nums[length] is skipped
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else { 
                i++;
            }
        }//sorting done
        
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length; //Case 2 - if last item from range is missing, returns that
    }
}