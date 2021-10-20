package _14_sorting_questions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class _2_findDisappeared_numbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();
        
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
        
        for(int j = 0; j < nums.length; j++){
            int correct = j + 1;
            if(correct != nums[j]){
                list.add(correct);
            }
        }
        
        return list;
    }
}