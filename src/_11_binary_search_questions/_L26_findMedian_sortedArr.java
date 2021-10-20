package _11_binary_search_questions;

// https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
// https://www.youtube.com/watch?v=LPFhl65R7ww
public class _L26_findMedian_sortedArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            //with this, nums1 with m length is the shorter array
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;

        //will do binary search over shorter array with length m
        int start = 0;
        int end = m;
        while(start <= end){ //using <= when value is neeeded, not index
            //need 2 mids for the 2 arrays
            int midX = start + (end - start) / 2;
            int midY = (m + n + 1) / 2 - midX;

            //need max and min for both partitions of each array. total 4
            //this also accounts for all edge cases
            int maxLeftX = (midX == 0) ? Integer.MIN_VALUE : nums1[midX - 1];
            int minRightX = (midX == m) ? Integer.MAX_VALUE : nums1[midX];

            int maxLeftY = (midY == 0) ? Integer.MIN_VALUE : nums2[midY - 1];
            int minRightY = (midY == n) ? Integer.MAX_VALUE : nums2[midY];

            //condition if middle elements of both arrays found, to find median
            if((maxLeftX <= minRightY) && (maxLeftY <= minRightX)){
                if((m + n) % 2 == 0){ //even array
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else { //odd array
                    return ((double)Math.max(maxLeftX, maxLeftY));
                }
                //shifting left if upper max item's bigger than lower min item
            } else if(maxLeftX > minRightY){
                end = midX - 1;
            } else {
                start = midX + 1;
            }
        }
        return 0.0;
    }
}
