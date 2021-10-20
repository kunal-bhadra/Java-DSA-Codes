package _11_binary_search_questions;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class _L7_find_rotationCount {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 0, 1, 2, 3, 4};
        int pivot = findPivot(arr);
        //if pivot = -1 (no rotations); -1+1 = 0; hence 0 rotations is returned
        int rotationCount = pivot + 1;
        System.out.println(rotationCount);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
