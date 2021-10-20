package _11_binary_search_questions;

// https://leetcode.com/problems/valid-perfect-square/
public class _L11_valid_perfectSquare {
    public boolean isPerfectSquare(int num) {
        //using long type to avoid mid*mid overflow error
        long start = 1;
        long end = num;

        while(start <= end){
            long mid = start + (end - start) / 2;

            if(mid * mid == num){
                return true;
            } else if(mid * mid < num ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
