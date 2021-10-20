package _11_binary_search_questions;

// https://leetcode.com/problems/split-array-largest-sum/
public class _L8_splitArray_largestSum {
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        //finding minimum and maximum sum values
        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary search
        //when returning a value use '<' else for index, use '<='
        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int i=0; i<nums.length; i++){
                if(sum + nums[i] > mid){
                    sum = nums[i];
                    pieces += 1;
                } else {
                    sum += nums[i];
                }
            }

            if(pieces > m){
                //we need less pieces -> the mid(sum) needs to get higher
                //for a higher mid, we need to search in the right
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; //here start==end
    }
}
