package _11_binary_search_questions;

//to find the floor of a given number: greatest no. <= target
public class _2_num_floor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,45,56,78,89,99};
        int target = 11;
        int ans = floor(arr, target);
        System.out.println("Index is: " +ans);
    }

    //returning the index of floor
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            //edge case for when target is smaller than smallest (first) value of arr
            if(target < arr[0]){
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

        //start returns index for greatest floor value <= target
        return end;
    }
}
