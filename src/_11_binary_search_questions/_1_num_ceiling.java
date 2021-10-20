package _11_binary_search_questions;

//to find the ceiling of a given number -> smallest no. >= target
public class _1_num_ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,45,56,78,89,99};
        int target = 85;
        int ans = ceiling(arr, target);
        System.out.println("Index is: " +ans);
    }

    //returning the index of ceiling
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //edge case for when target is larger than largest (last) value of arr
            if(target > arr[arr.length-1]){
                return -1;
            }

            int mid = start + (end - start)  / 2;

            if(target < arr[mid]){
                end = mid - 1; //search left
            } else if (target > arr[mid]){
                start = mid + 1; //search right
            } else {
                return mid; //if mid is returned, ceiling = target
            }
        }

        //start returns index for smallest ceiling value >=target
        return start;
    }
}
