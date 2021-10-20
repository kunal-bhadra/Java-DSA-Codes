package _11_binary_search_questions;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class _L10_twoSumII_inputArray {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] ans = {1, 1};

        while(start <= end){
            int sum = numbers[start] + numbers[end];

            if(sum > target){
                end--;
            } else if (sum < target){
                start++;
            } else {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            }
        }
        return ans;
    }
}
