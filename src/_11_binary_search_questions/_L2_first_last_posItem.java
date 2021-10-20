package _11_binary_search_questions;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class _L2_first_last_posItem {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1}; //default answer

        ans[0] = findIndex(nums, target, true);
        ans[1] = findIndex(nums, target, false);
        return ans;
    }

    int findIndex(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1; //default answer

        //index for both start and end, based on boolean
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                //potential answer found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
