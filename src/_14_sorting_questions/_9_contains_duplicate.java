package _14_sorting_questions;

// https://leetcode.com/problems/contains-duplicate/
import java.util.Arrays;

public class _9_contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
