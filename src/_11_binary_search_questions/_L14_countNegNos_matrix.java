package _11_binary_search_questions;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class _L14_countNegNos_matrix {
    public int countNegatives(int[][] grid) {
        int row = grid.length - 1;
        int count = 0;

        //iterating through each row
        for(int i=row; i>= 0; i--){
            int col = grid[i].length;
            int start = 0;
            int end = col - 1;

            //accounting for all edge cases
            if(grid[i][start] < 0){ //all neg. nos in row -> count = col length
                count += col;
                continue;
            } else if(grid[i][col-1] >= 0){ //no negs in row
                continue;
            }

            //binary search for mix of pos and neg nos.
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(grid[i][mid] < 0){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            count += col - start; //start is at index of 1st neg no. in row
        }
        return count;
    }
}
