package _11_binary_search_questions;

// https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/
public class _L17_findSingle_elemInArr {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length <= 1) return nums[0];

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            if(start < nums.length - 1 && nums[start] == nums[start + 1]){
                start += 2;
            } else if(end > 0 && nums[end] == nums[end - 1]){
                end -= 2;
            } else {
                return nums[start];
            }
        }

        return -1;
    }
}
