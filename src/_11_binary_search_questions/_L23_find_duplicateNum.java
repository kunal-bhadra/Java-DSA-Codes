package _11_binary_search_questions;

// https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;

public class _L23_find_duplicateNum {
    public int findDuplicate(int[] nums) {
        if(nums.length <= 1){
            return -1;
        }

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((mid > start) && (nums[mid] == nums[mid - 1])){
                return nums[mid];
            } else if((mid < end) && (nums[mid] == nums[mid + 1])){
                return nums[mid];
            } else if(nums[start] < nums[start + 1]){
                start++;
            } else {
                end--;
            }
        }

        return -1;
    }
}
