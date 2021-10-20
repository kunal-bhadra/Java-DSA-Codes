package _11_binary_search_questions;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
public class _L19_findMin_rotatedArr {
    public int findMin(int[] nums) {
        int peak = findPeak(nums);
        //minimum element is the one in front of max element
        int min = peak + 1;
        return nums[min];
    }

    int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if((mid < end) && (arr[mid] > arr[mid + 1])){
                return mid;
            } else if((mid > start) && (arr[mid] < arr[mid - 1])){
                return mid - 1;
            } else if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
