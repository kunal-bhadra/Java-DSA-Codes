package _11_binary_search_questions;

// https://leetcode.com/problems/search-a-2d-matrix/submissions/
public class _L21_search_sorted2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int row_nos = matrix.length;
        int col_nos = matrix[0].length;
        int start = 0;
        int end = row_nos * col_nos - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int mid_val = matrix[mid / col_nos][mid % col_nos];

            if (mid_val < target){
                start = mid + 1;
            } else if(mid_val > target){
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
