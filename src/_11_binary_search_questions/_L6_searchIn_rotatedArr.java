package _11_binary_search_questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class _L6_searchIn_rotatedArr {
    int search(int[] nums, int target) {
        int pivotIndex = findPivot(nums);

        if (pivotIndex == -1) {
            //no pivot found->array sorted normally, but this question has pivot present
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        int firstCheck = binarySearch(nums, target, 0, pivotIndex);
        if (firstCheck != -1) {
            return firstCheck;
        }

        int secondCheck = binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
        return secondCheck;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                //mid < end makes sure we don't go outside array range due to [mid+1]
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                //mid > start -> same reason as above
                return mid - 1;
            }
            //if elements at start, middle, end are equal, skip the duplicates
            if (arr[mid] == arr[start] && arr[start] == arr[end]) {
                //BUT what if the duplicates are pivot
                //checking if start is pivot or not before skipping
                if (arr[start] > arr[start + 1]) {
                    return start; //start is pivot
                }
                start++; //skip start

                //checking for end
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--; //skip end
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                //mid < end makes sure we don't go outside array range due to [mid+1]
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                //mid > start -> same reason as above
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


