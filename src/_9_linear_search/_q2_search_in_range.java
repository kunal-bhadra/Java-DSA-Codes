package _9_linear_search;

//checking for a number in an int array in a given specific range
public class _q2_search_in_range {
    public static void main(String[] args) {
        int[] arr = {12,21,23,45,235,345};
        int find = 23;
        System.out.println("Index of number found is: " +searchRange(arr, find, 1, 4));
    }

    static int searchRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
