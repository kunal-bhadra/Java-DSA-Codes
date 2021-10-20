package _11_binary_search_questions;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class _L24_capacity_shipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0;

        for(int w : weights){
            start = Math.max(start, w);
            end += w;
        }

        while(start < end){
            int mid = start + (end - start) / 2;
            int sum_temp = 0;
            int day_num = 1;

            for(int w : weights){
                if(sum_temp + w > mid){
                    day_num += 1;
                    sum_temp = 0;
                }
                sum_temp += w;
            }
            if(day_num > days){
                start = mid + 1;
            } else {
                end = mid;
            }
            //doing this instead of mid - 1 to check for lesser capacity
        }
        return start;
    }
}
