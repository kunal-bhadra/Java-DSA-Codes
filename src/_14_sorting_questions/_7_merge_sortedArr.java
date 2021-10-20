package _14_sorting_questions;

// https://leetcode.com/problems/merge-sorted-array/submissions/
public class _7_merge_sortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //sort from the back
        int tail1 = m - 1;
        int tail2 = n - 1;
        int end = m + n - 1;

        while(tail1 >= 0 && tail2 >= 0){
            nums1[end--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        //for when tail 1 < 0 and there's still elements left from nums2
        while(tail2 >= 0){
            nums1[end--] = nums2[tail2--];
        }
    }
}
