package _11_binary_search_questions;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class _L27_findMin_rotatedSorted {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[end]){
                start = mid + 1;
            } else if(nums[mid] < nums[end]){
                end = mid;
            } else if(nums[end - 1] > nums[end]){
                start = end;
                break;
            } else {
                end --;
            }
        }
        return nums[start];
    }
}
