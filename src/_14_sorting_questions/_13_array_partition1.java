package _14_sorting_questions;

// https://leetcode.com/problems/array-partition-i/submissions/
import java.util.Arrays;
class _13_array_partition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}