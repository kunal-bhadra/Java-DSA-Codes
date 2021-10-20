package _11_binary_search_questions;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class _L18_searchIn_rotatedArrII {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        //method without finding the peak
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return true;
            }

            while((nums[start] == nums[mid]) && (start != mid)){
                start++;
            }
            while((nums[mid] == nums[end]) && (mid != end)){
                end--;
            }

            if(nums[start] <= nums[mid]){
                if((nums[start] <= target) && (target < nums[mid])){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if((nums[mid] < target) && (target <= nums[end])){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
