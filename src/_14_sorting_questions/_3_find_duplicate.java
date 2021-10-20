package _14_sorting_questions;

// https://leetcode.com/problems/find-the-duplicate-number/submissions/
class _3_find_duplicate {
    public int findDuplicate(int[] nums) {
        //sorting
        int i = 0;
        while(i < nums.length){
            if(i + 1 != nums[i]){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    return nums[i];
                }
            } else { 
                i++;
            }
        }
        return -1;
    }
}