package _10_binary_search;


public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,45,56,78,89,99};
        int target = 78;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //returning the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //find the middle element
//            int mid = (start + end) / 2; #for very large numbers, the sum might exceed the range of int; hence errow
            int mid = start + (end - start)  / 2; //better way

            if(target < arr[mid]){
                end = mid - 1; //search left
            } else if (target > arr[mid]){
                start = mid + 1; //search right
            } else {
                return mid; //returns index of target element, if found
            }
        }

        //if nothing has been returned from the while loop, means element doesn't exist, returns -1
        return -1;
    }
}
