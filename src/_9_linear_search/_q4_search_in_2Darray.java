package _9_linear_search;

import java.util.Arrays;

//search for a number in 2D Array
public class _q4_search_in_2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {8,9}
        };
        int target = 6;
        int[] ans_index = search2D(arr, target);
        System.out.println("Index for number found is: " + Arrays.toString(ans_index));
    }

    static int[] search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                } //returning the row and col indices in array format
            }
        }

        return new int[]{-1,-1}; //when not found
    }
}
