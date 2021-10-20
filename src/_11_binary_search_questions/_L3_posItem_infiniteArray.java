package _11_binary_search_questions;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class _L3_posItem_infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,23,345,678,877};
        int target = 6;
        System.out.println(findRangeAndIndex(arr, target));
    }

    static int findRangeAndIndex(int[] array, int target){
        //starting with a box of 2
        int start = 0;
        int end = 1;

        //condition breaks if target is found in range
        while (target > array[end]){
            int newStart = end + 1;
            int newEnd = end + (end - start + 1) * 2; //doubling the range each time

            start = newStart;
            end = newEnd;
        }
        return binarySearch(array, target, start, end);
    }

    static int binarySearch(int[] array, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target > array[mid]){
                start = mid + 1;
            } else if (target < array[mid]){
                end = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
