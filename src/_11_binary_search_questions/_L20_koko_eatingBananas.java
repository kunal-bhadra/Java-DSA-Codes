package _11_binary_search_questions;

import java.util.Arrays;

// https://leetcode.com/problems/koko-eating-bananas/submissions/
public class _L20_koko_eatingBananas {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(arr, h));
    }

    static public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length - 1];

        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0;

            for(int i = 0; i < piles.length; i++){
                sum += (piles[i] + mid - 1) / mid;
            }

            if(sum > h){
                start = mid + 1;
            } else {
                end = mid;
                //reducing the space even when probable k is found, to find min k
            }
        }

        return start;
    }
}
