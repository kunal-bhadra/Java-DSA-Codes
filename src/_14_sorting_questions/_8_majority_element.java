package _14_sorting_questions;

import java.util.Arrays;

public class _8_majority_element {
    //using Boyer-Moore Majority Vote Algorithm for O(N) time & O(1) Space Complexity
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                count++;
                majority = nums[i];
            } else if(majority == nums[i]){
                count++;
            } else{
                count--;
            }
        }
        return majority;
    }

      //Binary Search solves this in more than O(N) time complexity, which is sub-optimal
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int start = 0;
//        int end = nums.length - 1;
//
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//
//            if(nums[mid] == nums[end] || nums[mid] == nums[start]){
//                return nums[mid];
//            } else if(nums[start] < nums[mid]){
//                start ++;
//            } else if(nums[end] > nums[mid]){
//                end --;
//            }
//        }
//        return -1;
//    }
}
