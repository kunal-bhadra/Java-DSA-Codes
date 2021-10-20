package _9_linear_search;

//https://leetcode.com/problems/richest-customer-wealth/
public class LC2_max_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int final_max = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++){
            int row_max = 0;
            for(int col = 0; col < accounts[row].length; col++){
                row_max += accounts[row][col];
            }
            final_max = Math.max(final_max, row_max);
        }
        return final_max;
    }
}
