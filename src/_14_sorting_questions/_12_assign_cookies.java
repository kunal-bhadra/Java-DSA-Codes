package _14_sorting_questions;

// https://leetcode.com/problems/assign-cookies/
import java.util.Arrays;

public class _12_assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int max = 0;
        int i = 0;
        for(int j = 0; i < g.length && j < s.length; j++){
            if(g[i] <= s[j]){
                max++;
                i++;
            }
        }
        return max;
    }
}
