package _14_sorting_questions;

// https://leetcode.com/problems/sort-array-by-parity/
class _15_sortArr_parity {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end){
            if(nums[start] % 2 == 0){
                start++;
            } else {
                if(nums[end] % 2 == 0){
                    swap(nums, start, end);
                    start++;
                    end--;
                }
                if(nums[end] % 2 == 1){
                    end--;
                }
            }
        }
        return nums;
    }
    
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}