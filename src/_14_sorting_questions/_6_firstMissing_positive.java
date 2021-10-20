package _14_sorting_questions;

// https://leetcode.com/problems/first-missing-positive/submissions/
class _6_firstMissing_positive {
    public int firstMissingPositive(int[] nums) {
        //sorting
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        
        //searching
        for(int j = 0; j < nums.length; j++){
            if(j + 1 != nums[j]){
                return j + 1;
            }
        }
        
        return nums.length + 1;
    }
}