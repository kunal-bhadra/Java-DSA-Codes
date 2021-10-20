package _11_binary_search_questions;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class _L4_peakItem_mountain {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else if(arr[mid] < arr[mid - 1] ){
                end = mid - 1;
            } else{
                return mid;
            }
        }

        return -1;
    }
}
